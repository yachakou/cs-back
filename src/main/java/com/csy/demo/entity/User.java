package com.csy.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "saver")
@Data
public class User {

    @Id
    @GeneratedValue
    @Column(name="id")
    private String id;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="firstname")
    private String firstname;

    @Column(name="lastname")
    private String lastname;

    @Column(name="email")
    private String email;

    @Column(name="enabled")
    private String enabled;

}
