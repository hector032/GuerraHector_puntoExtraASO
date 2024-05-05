package com.bbva.uuaa.helloWorld.facade.v0;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseCreated;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseNoContent;
import com.bbva.uuaa.helloWorld.business.v0.dto.BCreateUser;
import com.bbva.uuaa.helloWorld.facade.v0.dto.*;

import javax.validation.Valid;

public interface ISrvHelloWorld {

	ServiceResponse<Hello> helloWorld ();
	ServiceResponseCreated<Hello> helloWorldPost(Hello hello);
	ServiceResponseNoContent helloWorldPut(Hello hello);
	ServiceResponse.ServiceResponseBuilder helloWorldDelete(Hello hello);
	ServiceResponse<DtoOut> helloWorldMapper(DtoIn dtoIn);
	ServiceResponse<BCreateUser> createUser(CreateUser createUser);

	ServiceResponse<DtoOut> requestClaim(String request);

	//Usualmente para post (devuelve 201 created)
	ServiceResponseCreated<CreateLoanOut> createLoan(CreateLoan createLoan);
	ServiceResponseCreated<NewUserOut> newUser(NewUser newUser);

	ServiceResponseNoContent newUserPut(@Valid NewUser newUser);

}
