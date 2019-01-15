package com.bbva.uuaa.helloWorld.facade.v0;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;
import com.bbva.uuaa.helloWorld.facade.v0.dto.Hello;

public interface ISrvHelloWorld {
	
	ServiceResponse<Hello> helloWorld ();

}
