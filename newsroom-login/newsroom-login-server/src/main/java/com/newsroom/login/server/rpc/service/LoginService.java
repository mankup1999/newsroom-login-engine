package com.newsroom.login.server.rpc.service;

import com.newsroom.login.proto.rpc.Data;
import com.newsroom.login.proto.rpc.LoginRequest;
import com.newsroom.login.proto.rpc.LoginResponse;
import com.newsroom.login.proto.rpc.LoginServiceGrpc.LoginServiceImplBase;

import io.grpc.stub.StreamObserver;

public class LoginService extends LoginServiceImplBase {

    @Override
    public void login(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {

        Data data = Data.newBuilder().setUserID("AB-12345").build();

        LoginResponse loginResponse = LoginResponse.newBuilder().setSuccess(true).setData(data).build();

        responseObserver.onNext(loginResponse);
        responseObserver.onCompleted();

    }

}
