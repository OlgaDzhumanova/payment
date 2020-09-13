package ru.sbrf.Sbol.Common.Exception;

public class ExceptionUser extends RuntimeException {
    private String accountNumber;
    private String userNumber;

    public ExceptionUser(String message) {
        super(message);
    }
}


