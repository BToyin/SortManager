package com.sparta.toyin.Exceptions;

public class ChildNotFoundException extends Exception {

    public ChildNotFoundException(String message) {
        super(message);
    }

    public ChildNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
