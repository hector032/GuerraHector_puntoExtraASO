package com.bbva.uuaa.helloWorld.business.v0.dao;

import com.bbva.uuaa.helloWorld.business.v0.dto.*;

public interface ISrvHelloWorldDAO {
    BCreateUserOut map(BCreateUser bCreateUser);
    BDtoOut mapDaoGet(String bRequest);

    BCreateLoanOut mapLoan(BCreateLoan bCreateLoan);

    BNewUserOut mapUser(BNewUser bNewUser);
}
