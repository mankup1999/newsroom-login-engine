package com.newsroom.login.server;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.newsroom.login.server.config.LoginGrpcConfig;

@SpringBootApplication
public class NewsroomLoginServerApplication {

    public static void main(String[] args) throws IOException, InterruptedException {

        SpringApplication.run(NewsroomLoginServerApplication.class, args);

        new LoginGrpcConfig().serverStartUp();

    }

}
