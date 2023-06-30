package com.kodilla.exeption.homework;

public class OrderDoesNotExistException extends Exception {
    public OrderDoesNotExistException(String message) {
        super(message);
    }
}
