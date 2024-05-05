package com.bbva.uuaa.helloWorld.facade.v0.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CreateUser {
    @NotNull
    private String name;
    @NotEmpty
    private String surname;
    @Valid
    private IdentityDocuments identityDocuments;
}
