package ru.sbrf.Sbol.Application.ValidationApp;

import ru.sbrf.Sbol.Common.Exception.ExceptionAppUser;

public class ValidationPhoneNumber {
    private String phoneNumber;

    public ValidationPhoneNumber ValidationPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() != 12 & !phoneNumber.startsWith("+7")){
            throw new ExceptionAppUser("неверный номер телефона");
        }
        return this;
    }
}
