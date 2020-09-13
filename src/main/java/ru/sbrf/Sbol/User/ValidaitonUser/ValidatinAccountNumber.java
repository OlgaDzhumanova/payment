package ru.sbrf.Sbol.User.ValidaitonUser;

import ru.sbrf.Sbol.Common.Exception.ExceptionUser;

public class ValidatinAccountNumber {
    private String accountNumber;

    public ValidatinAccountNumber ValidatinAccountNumber(String accountNumber) {
        if(accountNumber.length() != 20){
            throw new ExceptionUser("неверный номер счета!" + accountNumber);
        }
        return this;
    }
}
