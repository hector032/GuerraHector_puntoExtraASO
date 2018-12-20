package com.bbva.qsrv.asoExamples.jsr380Validation.facade.v01;

import com.bbva.jee.arq.spring.core.servicing.annotations.SMC;
import com.bbva.jee.arq.spring.core.servicing.annotations.SN;
import com.bbva.jee.arq.spring.core.servicing.annotations.VN;
import com.bbva.jee.arq.spring.core.servicing.gce.BusinessServiceException;
import com.bbva.qsrv.asoExamples.jsr380Validation.dto.Hello;
import com.bbva.qsrv.asoExamples.jsr380Validation.dto.Person;
import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Service
@SN (registryID = "SN000000001", logicalID = "aso-examples")
@VN (vnn = "V01")
@Path ("/V01")
public class SrvHelloWorld implements ISrvHelloWorld {
	
	@Override
	@GET
	@Path ("/hello")
	@Produces ({MediaType.APPLICATION_JSON})
	@SMC (registryID = "SMC000000002", logicalID = "hello")
	public Response helloWorld () throws BusinessServiceException {
		return Response.ok("{\"message\" : \"Hello World\"}")
		               .build();
	}
	
	@Override
	@GET
	@Path ("/jsr380Validation")
	@Produces ({MediaType.APPLICATION_JSON})
	@SMC (registryID = "SMC000000003", logicalID = "jsr380Validation")
	public Hello jsr380Validation (Person person) throws BusinessServiceException {
		return new Hello(person.getName());
	}
}
