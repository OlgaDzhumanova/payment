package ru.sbrf.Sbol.Application.ValidationApp;

import ru.sbrf.Sbol.Common.Exception.ExceptionAppUser;

public class ValidationAmount <T>{
    private static float T;

    public float ValidationAmount() {
        if( T == 0){
            throw new  ExceptionAppUser("invalid amount");
        }else {
            return T;
        }
    }
}
