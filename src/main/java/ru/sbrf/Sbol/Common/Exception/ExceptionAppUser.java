package ru.sbrf.Sbol.Common.Exception;

public class ExceptionAppUser extends RuntimeException {
    private String phoneNumber;
    private float amount;
    private String currency;

    public ExceptionAppUser(String message) {
        super(message);
    }
}
