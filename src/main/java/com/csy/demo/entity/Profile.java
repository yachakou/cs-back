package com.csy.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "profile", schema = "saver")
@Data
public class Profile {

    @Id
    @GeneratedValue
    @Column(name="id")
    private String id;

    @Column(name="mail")
    private String mail;

    @Column(name="name")
    private String name;

    @Column(name="nickname")
    private String nickname;

    public Profile() {
    }

    public Profile(String mail, String name, String nickname) {
        this.mail = mail;
        this.name = name;
        this.nickname = nickname;
    }
}

