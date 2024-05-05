package com.bbva.uuaa.helloWorld.business.v0.dao.impl;

import com.bbva.uuaa.helloWorld.business.v0.dao.ISrvHelloWorldDAO;
import com.bbva.uuaa.helloWorld.business.v0.dto.*;
import org.springframework.stereotype.Component;

import javax.ws.rs.BadRequestException;

@Component(value = "srvHelloWorldDAO")
public class SrvHelloWorldDAO implements ISrvHelloWorldDAO {
    @Override
    public BCreateUserOut map(BCreateUser bCreateUser) {
        BCreateUserOut bCreateUserOut = new BCreateUserOut();

        if(validateObject(bCreateUser)){
            return null;
        }
        bCreateUserOut.setName(bCreateUser.getName());
        bCreateUserOut.setSurname(bCreateUser.getSurname());
        bCreateUserOut.setDocumentNumber(bCreateUser.getIdentityDocuments().getDocumentNumber());
        bCreateUserOut.setDocumentType(bCreateUser.getIdentityDocuments().getDocumentType());
        return bCreateUserOut;
        }

        //GET
    @Override
    public BDtoOut mapDaoGet(String bRequest) {
        BDtoOut bDtoOut = new BDtoOut();

        BOperationStatus operationStatus = new BOperationStatus();
        operationStatus.setId(BOperationStatus.Status.APPROVED);
        bDtoOut.setOperationStatus(operationStatus);

        bDtoOut.setOperationsNumber(5);

        BClaimAmount claimAmount = new BClaimAmount();
        claimAmount.setAmount(250);
        claimAmount.setCurrency(BClaimAmount.Currency.MXN);
        bDtoOut.setClaimAmount(claimAmount);

        BOperationsAmount operationsAmount = new BOperationsAmount();
        operationsAmount.setAmountt(300);
        operationsAmount.setCurrencyy(BOperationsAmount.Currency.MXN);
        bDtoOut.setOperationsAmount(operationsAmount);

        return bDtoOut;
    }

        //POST
    @Override
    public BCreateLoanOut mapLoan(BCreateLoan bCreateLoan) {
        BCreateLoanOut  bCreateLoanOut = new BCreateLoanOut();

        bCreateLoanOut.setId(bCreateLoan.getId());
        bCreateLoanOut.setLoanId(bCreateLoan.getLoanId());

        BIncomeValues bIncomeValues = new BIncomeValues();

        bIncomeValues.setAmount(bCreateLoan.getIncomeValues().getAmount());
        bIncomeValues.setCurrency(bCreateLoan.getIncomeValues().getCurrency());

        bCreateLoanOut.setIncomeValues(bIncomeValues);
        return bCreateLoanOut;
    }

    @Override
    public BNewUserOut mapUser(BNewUser bNewUser) {
        BNewUserOut bNewUserOut = new BNewUserOut();
        bNewUserOut.setNombre(bNewUser.getNombre());

        validateApellido(bNewUser.getApellido());
        bNewUserOut.setApellido(bNewUser.getApellido());

        //Validamos que el numero de telefono tenga exactamente 10 caracteres
        if (bNewUser.getCelular().toString().length() == 10) {
            bNewUserOut.setCelular(bNewUser.getCelular());
        } else {
            throw new BadRequestException();
        }

        bNewUserOut.setCorreo(bNewUser.getCorreo());
        bNewUserOut.setDni(bNewUser.getDni());
        return bNewUserOut;
    }

    //Metodo para validar que el apellido pueda estar vacio y que sea solo mayusculas
    public void validateApellido(String apellido) {
        if (apellido.isEmpty()) {
            return;
        }
        if (!apellido.equals(apellido.toUpperCase())) {
            throw new BadRequestException();
        }
    }

    /***
        * Malas prácticas por if dentro de if
        *
        *
        if (bCreateUser != null) {
            bCreateUserOut.setName(bCreateUserOut.getName());
            bCreateUserOut.setSurname(bCreateUserOut.getSurname());
            if (bCreateUser.getIdentityDocuments() != null) {
                bCreateUserOut.setDocumentNumber(bCreateUser.getIdentityDocuments().getDocumentNumber());
                bCreateUserOut.setDocumentType(bCreateUser.getIdentityDocuments().getDocumentType());
            }
            return bCreateUserOut;
        }
        return null;
    }
    */
       private boolean validateObject(BCreateUser bCreateUser){
           return bCreateUser == null || bCreateUser.getIdentityDocuments() == null;
       }
}
