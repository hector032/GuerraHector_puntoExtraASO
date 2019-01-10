package com.bbva.qzqp.helloWorld.facade.v0;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;
import com.bbva.jee.arq.spring.core.servicing.annotations.SMC;
import com.bbva.jee.arq.spring.core.servicing.annotations.SN;
import com.bbva.jee.arq.spring.core.servicing.annotations.VN;
import com.bbva.qzqp.helloWorld.facade.v0.dto.Hello;
import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Service
@SN (registryID = "SN000000001", logicalID = "helloWorld")
@VN (vnn = "v0")
@Path ("/v0")
public class SrvHelloWorld implements ISrvHelloWorld {
	
	@Override
	@GET
	@Path ("/hello")
	@Produces ({MediaType.APPLICATION_JSON})
	@SMC (registryID = "SMC000000001", logicalID = "hello")
	public ServiceResponse<Hello> helloWorld ()  {
		Hello hello = new Hello("Hello World!");
		return ServiceResponse.data(hello).build();
	}

}
