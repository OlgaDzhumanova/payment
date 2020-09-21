package ru.sbrf.Sbol.Common.Exception;

public class ExceptionUser extends RuntimeException {
    private String accountNumber;
    private String userNumber;

    public ExceptionUser(String message) {
        super(message);
    }

    public ExceptionUser(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionUser(Throwable cause) {
        super(cause);
    }

    public ExceptionUser(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ExceptionUser() {
    }
}


