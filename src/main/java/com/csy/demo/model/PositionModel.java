package com.csy.demo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PositionModel {

    private String longitude;
    private String latitude;
    private String adresse;
}
