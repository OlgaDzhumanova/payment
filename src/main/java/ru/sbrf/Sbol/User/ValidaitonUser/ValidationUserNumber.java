package ru.sbrf.Sbol.User.ValidaitonUser;

import ru.sbrf.Sbol.Common.Exception.ExceptionUser;

public class ValidationUserNumber {
    private String userNumber;

    public ValidationUserNumber ValidationUserNumber(String userNumber) {
        if (userNumber.length() != 10){
            throw new ExceptionUser("неверный номер пользователя:" + userNumber);

        }
        return this;
    }
}
