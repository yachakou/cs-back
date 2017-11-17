package com.csy.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateEventBody {

    private String name;
    private String mail;
    private PositionModel adresse;
    public String dateJour;
    public String horraire;
    public String nombrePersonne;
    public String typeEvent;

}
