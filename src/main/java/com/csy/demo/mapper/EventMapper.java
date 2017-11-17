package com.csy.demo.mapper;

import com.csy.demo.entity.Adresse;
import com.csy.demo.entity.Event;
import com.csy.demo.model.CreateEventBody;

public class EventMapper {

    public static Event populateEvent(CreateEventBody createEventBody) {
        Event event = new Event();
        event.setTypeEvent(createEventBody.typeEvent);
//        event.setDate(createEventBody.dateJour);
        event.setHoraire(createEventBody.horraire);
        event.setNbParticipants(createEventBody.nombrePersonne);
        Adresse adresse = new Adresse();
        adresse.setAdresse(createEventBody.getAdresse().getAdresse());
        adresse.setLatitude(createEventBody.getAdresse().getLatitude());
        adresse.setLongitude(createEventBody.getAdresse().getLongitude());
        event.setAdresse(adresse);
        return event;
    }


}
