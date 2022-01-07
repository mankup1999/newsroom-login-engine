package com.newsroom.login.mysql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;

@Getter
@Entity(name = "login_user_details")
@Table
public class LoginUser {

    @Id
    @Column(name = "user_id", nullable = false)
    private String UCC;

    @Column(name = "mail_id", nullable = false)
    private String mailID;

    @Column(name = "mob_no", nullable = false)
    private String mob;

    @Column(name = "password", nullable = false)
    private String password;
}
