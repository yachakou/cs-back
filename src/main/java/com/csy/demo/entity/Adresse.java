package com.csy.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "adresse", schema = "saver")
@Data
public class Adresse {

    @Id
    @GeneratedValue
    @Column(name="id")
    private String id;

    @Column(name="longitude")
    private String longitude;

    @Column(name="latitude")
    private String latitude;

    @Column(name="adresse")
    private String adresse;

    public Adresse(String longitude, String latitude, String adresse) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.adresse = adresse;
    }

    public Adresse() {
    }
}
