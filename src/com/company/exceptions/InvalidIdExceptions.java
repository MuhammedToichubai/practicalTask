package com.company.exceptions;

public class InvalidIdExceptions extends RuntimeException {

    public InvalidIdExceptions() {
    }

    public InvalidIdExceptions(String message) {
        super(message);
    }
}