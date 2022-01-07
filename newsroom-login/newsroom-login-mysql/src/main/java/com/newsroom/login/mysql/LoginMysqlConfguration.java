package com.newsroom.login.mysql;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = { "com.newsroom.login.mysql.entity" })
@EnableJpaRepositories(basePackages = { "com.newsroom.login.mysql.repo" })
public class LoginMysqlConfguration {

}
