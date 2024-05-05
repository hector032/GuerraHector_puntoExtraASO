package com.bbva.uuaa.helloWorld.facade.v0.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class IdentityDocuments {
    @NotBlank
    private String documentNumber;
    @NotBlank
    private String documentType;
}
