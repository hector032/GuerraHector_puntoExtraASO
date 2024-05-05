package com.bbva.uuaa.helloWorld.business.v0.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BCreateUserOut {
    private String name;
    private String surname;
    private String documentNumber;
    private String documentType;
}
