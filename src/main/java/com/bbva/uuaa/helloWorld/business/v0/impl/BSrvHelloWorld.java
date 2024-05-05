package com.bbva.uuaa.helloWorld.business.v0.impl;

import com.bbva.uuaa.helloWorld.business.v0.IBSrvHelloWorld;
import com.bbva.uuaa.helloWorld.business.v0.dao.ISrvHelloWorldDAO;
import com.bbva.uuaa.helloWorld.business.v0.dto.*;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component(value = "bSrvHelloWorld")
public class BSrvHelloWorld implements IBSrvHelloWorld {
    @Resource(name = "srvHelloWorldDAO")
    private ISrvHelloWorldDAO dao;
    @Override
    public BCreateUserOut mapBusiness(BCreateUser bCreateUser) {
        BCreateUserOut bCreateUserOut = new BCreateUserOut();
        bCreateUserOut = dao.map(bCreateUser);
        return bCreateUserOut;
    }

    @Override
    public BDtoOut mapBusinessGet(String bRequest) {

        return dao.mapDaoGet(bRequest);
    }

    @Override
    public BCreateLoanOut businessLoan(BCreateLoan bCreateLoan) {
        BCreateLoanOut bCreateLoanOut = new BCreateLoanOut();
        bCreateLoanOut = dao.mapLoan(bCreateLoan);
        return bCreateLoanOut;
    }

    public BNewUserOut businessUser(BNewUser bNewUser) {
        BNewUserOut bNewUserOut = new BNewUserOut();
        bNewUserOut = dao.mapUser(bNewUser);
        return bNewUserOut;
    }


}
