package com.bbva.uuaa.helloWorld.facade.v0.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
public class NewUser {
    @NotNull
    @NotEmpty
    @Pattern(regexp = "[A-Z]+", message = "debe ser en mayusculas.")
    private String nombre;
    @NotNull
    //@Pattern(regexp = "[A-Z]+", message = "debe ser en mayusculas.")
    private String apellido;
    private Number celular;
    @Pattern(regexp = ".*@.*", message = "debe contener @")
    private String correo;
    @NotNull
    @NotEmpty
    private String dni;

}
