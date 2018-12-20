package com.bbva.qsrv.asoExamples.jsr380Validation.facade.v01;

import com.bbva.jee.arq.spring.core.servicing.gce.BusinessServiceException;
import com.bbva.qsrv.asoExamples.jsr380Validation.dto.Hello;
import com.bbva.qsrv.asoExamples.jsr380Validation.dto.Person;

import javax.ws.rs.core.Response;

public interface ISrvHelloWorld {
	
	Response helloWorld ();
	
	Hello jsr380Validation (Person whoami) throws BusinessServiceException;
}
