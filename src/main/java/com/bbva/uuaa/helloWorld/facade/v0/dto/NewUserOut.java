package com.bbva.uuaa.helloWorld.facade.v0.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewUserOut {
    private String nombre;
    private String apellido;
    private Number celular;
    private String correo;
    private String dni;
}
