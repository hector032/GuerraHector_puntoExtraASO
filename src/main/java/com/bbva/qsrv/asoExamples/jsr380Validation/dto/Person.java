package com.bbva.qsrv.asoExamples.jsr380Validation.dto;

import javax.validation.constraints.NotNull;

public class Person {
	
	@NotNull String name;
	
	public String getName () {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
}
