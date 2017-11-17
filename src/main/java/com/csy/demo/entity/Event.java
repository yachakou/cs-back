package com.csy.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "event", schema = "saver")
@Data
public class Event {

    @Id
    @GeneratedValue
    @Column(name="id")
    private String id;

    @OneToOne(fetch=FetchType.LAZY)
    private Adresse adresse;

//    @Column(name="date", unique = false)
//    private String date;

    @Column(name="typeEvent")
    private String typeEvent;

    @Column(name="horaire")
    private String horaire;

    @Column(name="nbParticipants")
    private String nbParticipants;

//    @Column(name="participants")
//    @OneToMany
//    private List<Profile> profiles;

    @OneToOne
    private Profile owner;

    public Event(Adresse adresse, String date, String typeEvent, String horaire, String nbParticipants, List<Profile> profiles) {
        this.adresse = adresse;
//        this.date = date;
        this.typeEvent = typeEvent;
        this.horaire = horaire;
        this.nbParticipants = nbParticipants;
//        this.profiles = profiles;
    }

    public Event() {
    }
}
