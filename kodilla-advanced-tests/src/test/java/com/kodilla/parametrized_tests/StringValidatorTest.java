package com.kodilla.parametrized_tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringValidatorTest {

    private StringValidator validator = new StringValidator();

    @Test
    void shouldReturnFalseIfStringIsNotEmpty() {
        assertFalse(validator.isBlank("test"));
    }

    @Test
    void shouldReturnTrueIfStringIsNotEmpty() {
        assertTrue(validator.isBlank(""));
    }

    @Test
    void shouldReturnTrueIfStringHasOnlySpace() {
        assertTrue(validator.isBlank("     "));
    }

    @Test
    void shouldReturnTrueIfStringIsNull() {
        assertTrue(validator.isBlank(null));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "   "})
    public void shouldReturnTrueIfStringIsEmptyTest(String text){
        assertTrue(validator.isBlank(text));
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnTrueIfStringIsNull(String text){
        assertTrue(validator.isBlank(text));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnTrueIfStringIsEmptyTest2(String text){
        assertTrue(validator.isBlank(text));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsEmpty(String text) {
        System.out.println("|" + text + "|");
        assertTrue(validator.isBlank(text));
    }
}