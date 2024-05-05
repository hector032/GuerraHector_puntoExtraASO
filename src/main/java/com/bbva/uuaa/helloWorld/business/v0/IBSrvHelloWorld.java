package com.bbva.uuaa.helloWorld.business.v0;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseCreated;
import com.bbva.uuaa.helloWorld.business.v0.dto.*;
import com.bbva.uuaa.helloWorld.facade.v0.dto.CreateLoan;

public interface IBSrvHelloWorld {
    BCreateUserOut mapBusiness(BCreateUser bCreateUser);
    BDtoOut mapBusinessGet(String bRequest);

    BCreateLoanOut businessLoan(BCreateLoan bCreateLoan);
    BNewUserOut businessUser(BNewUser bNewUser);
}
