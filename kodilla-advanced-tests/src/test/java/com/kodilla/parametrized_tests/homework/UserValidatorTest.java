package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTest {
    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"user123&", "User1@.-_", "U3"})
    public void shouldReturnFalseIfUsernameIsIncorrect(String username) {
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"User", "User1._-", "user", "000", "._-"})
    public void shouldReturnTrueIfUsernameIsCorrect(String username) {
        assertTrue(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"User.pl", "user@1221", "000.pl", ".com", "2@.@.pl"})
    public void shouldReturnFalseIfEmailIsCorrect(String email) {
        assertFalse(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"User@gmail.pl", "user@1221.ggg", "00@g2.pl", "o.e22@g-2.com", "nazwa-user@o2.pl"})
    public void shouldReturnTrueIfEmailIsCorrect(String email) {
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnTrueIfEmailIsEmpty(String email) {
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseIfUsernameIsEmpty(String username) {
        assertFalse(userValidator.validateUsername(username));
    }
}