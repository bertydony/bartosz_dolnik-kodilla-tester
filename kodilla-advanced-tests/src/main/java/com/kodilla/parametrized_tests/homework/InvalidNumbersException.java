package com.kodilla.parametrized_tests.homework;

public class InvalidNumbersException extends Exception {
    public InvalidNumbersException() {
        super("Wrong numbers provided");
    }
}
