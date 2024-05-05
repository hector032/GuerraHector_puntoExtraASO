package com.bbva.uuaa.helloWorld.facade.v0.mapper;

import com.bbva.uuaa.helloWorld.business.v0.dto.*;
import com.bbva.uuaa.helloWorld.facade.v0.dto.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ISrvHelloWorldMapper {
    //@Mapping(target = "message", source = "dtoIn.cellphone")
    //Hello mapIn(DtoIn dtoIn);
    //@Mapping(target = "message", source = "hello.message")
    //DtoOut mapOut(Hello hello);

    //BCreateLoan mapInCreateLoan(CreateLoan dtoIn);

    @Mapping(target = "name", source = "dtoIn.name")
    @Mapping(target = "surname", source = "dtoIn.surname")
    @Mapping(target = "identityDocuments.documentNumber", source = "dtoIn.identityDocuments.documentNumber")
    @Mapping(target = "identityDocuments.documentType", source = "dtoIn.identityDocuments.documentType")
    BCreateUser mapInCreateUser(CreateUser dtoIn);

    @Mapping(target = "name", source = "dtoIn.name")
    @Mapping(target = "surname", source = "dtoIn.surname")
    @Mapping(target = "documentNumber", source = "dtoIn.documentNumber")
    @Mapping(target = "documentType", source = "dtoIn.documentType")
    CreateUserOut mapOutCreateUser(BCreateUserOut dtoIn);

    @Mapping(target = "operationStatus.id", source = "id.id")
    @Mapping(target = "operationsNumber", source = "operationsNumber")
    @Mapping(target = "claimAmount.amount", source = "amount.amount")
    @Mapping(target = "claimAmount.currency", source = "currency.currency")
    @Mapping(target = "operationsAmount.amountt", source = "amount.amount")
    @Mapping(target = "operationsAmount.currencyy", source = "currency.currency")
    DtoOut mapHelloToDtoOut(Hello hello);

    //entrada
    //mapping se usan cuando hacemos mappstruck y mandamos a apx,
    //(se usa cuando nos nombres de apx son distintos a los de aso, pues aqui se especifica a donde apunta cad parametro)
    // @Mapping(target = "id", source = "createLoan.id")
    // @Mapping(target = "loanId", source = "createLoan.loanId")
    // @Mapping(target = "incomeValues.amount", source = "createLoan.incomeValues.amount")
    // @Mapping(target = "incomeValues.currency", source = "createLoan.incomeValues.currency")
    BCreateLoan mapInCreateLoan(CreateLoan createLoan);

    //salida
    // @Mapping(target = "id", source = "createLoan.id")
    // @Mapping(target = "loanId", source = "createLoan.loanId")
    // @Mapping(target = "amount", source = "createLoan.amount")
    // @Mapping(target = "currency", source = "createLoan.currency")
    CreateLoanOut mapOutLoan(BCreateLoanOut bCreateLoanOut);

    //entrada
    //String mapInRequestClaim(String request);

    //salida

    DtoOut mapOutRequestClaim(BDtoOut bDtoOut);

    BNewUser mapInNewUser(NewUser newUser);
    NewUserOut mapOutNewUser(BNewUserOut bNewUserOut);





}