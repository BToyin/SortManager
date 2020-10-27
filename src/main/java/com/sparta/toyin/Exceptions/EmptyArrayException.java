package com.sparta.toyin.Exceptions;

public class EmptyArrayException extends Exception{

    public EmptyArrayException(String message) {
        super(message);
    }

    public EmptyArrayException(String message, Throwable cause) {
        super(message,cause);
    }
}
