package ru.sbrf.Sbol.Common.Exception;

public class ExceptionAppUser extends RuntimeException {
    private String phoneNumber;
    private float amount;
    private String currency;

    public ExceptionAppUser(String message) {
        super(message);
    }

    public ExceptionAppUser(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionAppUser(Throwable cause) {
        super(cause);
    }

    public ExceptionAppUser(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ExceptionAppUser() {
    }
}
