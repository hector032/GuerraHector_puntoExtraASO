package com.bbva.qsrv.asoExamples.jsr380Validation.dto;

public class Hello {
	
	String message;
	
	public Hello (String message) {
		this.message = message;
	}
	
	public String getMessage () {
		return message;
	}
	
	public void setMessage (String message) {
		this.message = message;
	}
}
