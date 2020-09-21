package ru.sbrf.Sbol.Application.ValidationApp;

import ru.sbrf.Sbol.Common.Exception.ExceptionAppUser;

public class ValidationCurrency<T> {

    private static final String T = new String();

    enum T{
        EUR("978"),
        USD("840"),
        RUB("810");

        T(String s) {
        }
    }
    public void ValidationCurrency(String currency){
        if(currency != ValidationCurrency.T){
            throw new ExceptionAppUser("invalid currency");
        }

    }
}



