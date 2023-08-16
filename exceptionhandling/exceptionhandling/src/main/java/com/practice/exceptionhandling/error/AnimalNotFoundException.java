package com.practice.exceptionhandling.error;

public class AnimalNotFoundException extends Exception{
    public AnimalNotFoundException() {
        super();
    }

    public AnimalNotFoundException(String message) {
        super(message);
    }

    public AnimalNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public AnimalNotFoundException(Throwable cause) {
        super(cause);
    }

    protected AnimalNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
