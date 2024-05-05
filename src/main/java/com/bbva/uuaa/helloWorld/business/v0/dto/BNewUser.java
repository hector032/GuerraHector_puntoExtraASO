package com.bbva.uuaa.helloWorld.business.v0.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BNewUser {
    private String nombre;
    private String apellido;
    private Number celular;
    private String correo;
    private String dni;
}
