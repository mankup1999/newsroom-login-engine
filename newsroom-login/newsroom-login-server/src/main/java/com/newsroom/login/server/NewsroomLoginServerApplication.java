package com.newsroom.login.server;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.newsroom.login.mysql.LoginMysqlConfguration;
import com.newsroom.login.mysql.repo.LoginUserRepo;
import com.newsroom.login.server.rpc.service.LoginService;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
@Import(value = { LoginMysqlConfguration.class })
@ComponentScan(basePackages = { "com.newsroom.login.server" })
public class NewsroomLoginServerApplication {

    @Value("${login.grpc.url.port}")
    private int port;

    @Autowired
    private LoginUserRepo loginUserRepo;

    public static LoginUserRepo repo;

    public static void main(String[] args) {
        SpringApplication.run(NewsroomLoginServerApplication.class, args);
    }

    @PostConstruct
    public void serverStartUp() throws IOException, InterruptedException {

        log.info("gRPC server is starting...");

        Server server = ServerBuilder.forPort(port).addService(new LoginService()).build();

        server.start();

        log.info("gRPC is Up at {}", server.getPort());

        repo = loginUserRepo;

        server.awaitTermination();
    }

}
