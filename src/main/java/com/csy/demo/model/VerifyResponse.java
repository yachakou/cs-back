package com.csy.demo.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class VerifyResponse {

    private String id;
    private String status;
    private boolean isVerified;
}
