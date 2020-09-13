package ru.sbrf.Sbol.Application.ValidationApp;

import ru.sbrf.Sbol.Common.Exception.ExceptionAppUser;

public class ValidationCurrency {
    private String currency;

    public ValidationCurrency ValidationCurrency(String currency) {
        if((currency == "RUB")&(currency == "UER")&(currency == "USD")){
            throw new ExceptionAppUser("неверно введена валюта");
        }
        return this;
    }
}
