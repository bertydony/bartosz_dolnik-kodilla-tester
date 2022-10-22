package com.kodilla.parametrized_tests;



import java.util.stream.Stream;

public class StringManipulator {

    public String reverseWithLowerCase(String input){
        StringBuilder builder = new StringBuilder(input);
        return builder.reverse().toString().toLowerCase();
    }

    public int getStringLengthWithoutSpaces(String input) {
        String value = input.replaceAll(" ", "");
        return value.length();
    }
}