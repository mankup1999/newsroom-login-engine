package com.newsroom.login.server.rpc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.newsroom.login.mysql.entity.LoginUser;
import com.newsroom.login.mysql.repo.LoginUserRepo;
import com.newsroom.login.proto.rpc.Data;
import com.newsroom.login.proto.rpc.LoginRequest;
import com.newsroom.login.proto.rpc.LoginResponse;
import com.newsroom.login.proto.rpc.LoginServiceGrpc.LoginServiceImplBase;
import com.newsroom.login.server.NewsroomLoginServerApplication;

import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class LoginService extends LoginServiceImplBase {

    private static LoginUserRepo loginUserRepo;

    @Override
    public void login(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {

        loginUserRepo = getLoginUserRepo();

        log.info("Request: grpc login request[mail:{} mob:{} password:{}]", request.getMailID(), request.getMob(),
                request.getPassword());

        String userID = tryLogin(request);

        LoginResponse loginResponse = getLoginResponse(userID);

        log.info("Response: grpc login response[success:{} user-id:{} ]", loginResponse.getSuccess(),
                loginResponse.getData().getUserID());

        responseObserver.onNext(loginResponse);
        responseObserver.onCompleted();

    }

    public LoginResponse getLoginResponse(String userID) {

        Data data = Data.newBuilder().setUserID(userID).build();

        return LoginResponse.newBuilder().setData(data).setSuccess(isSuccess(userID)).build();

    }

    public String tryLogin(LoginRequest request) {

        log.info("Request to Database..");

        String userID = "";
        List<LoginUser> ids = new ArrayList<LoginUser>();

        if (request != null) {
            if (request.getMailID().length() == 0) {
                ids = loginUserRepo.findByMobAndPassword(request.getMob(), request.getPassword());
            }

            else {
                ids = loginUserRepo.findByMailAndPassword(request.getMailID(), request.getPassword());
            }
        }

        for (LoginUser id : ids) {
            userID = id.getUCC();
        }

        log.info("Database queried succesfully..");

        return userID;
    }

    public LoginUserRepo getLoginUserRepo() {
        return NewsroomLoginServerApplication.repo;
    }

    public boolean isSuccess(String userID) {
        return userID.length() == 0 ? false : true;
    }

}
