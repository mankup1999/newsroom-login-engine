package com.newsroom.login.server.config;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.newsroom.login.server.rpc.service.LoginService;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class LoginGrpcConfig {

    @Value("${login.grpc.url.port}")
    private int port;

    @Bean
    public void serverStartUp() throws IOException, InterruptedException {

        log.info("gRPC server is starting...");

        Server server = ServerBuilder.forPort(port).addService(new LoginService()).build();

        server.start();

        log.info("gRPC is Up at {}", server.getPort());

        server.awaitTermination();
    }

}
