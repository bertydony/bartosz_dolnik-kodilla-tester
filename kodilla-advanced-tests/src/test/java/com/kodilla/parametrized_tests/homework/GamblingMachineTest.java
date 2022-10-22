package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTest {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/wrongNumbers.csv")
    public void shouldThrowExceptionWithWrongNumbers(String numbers) {
        String[] expectedArray = numbers.split(" ");
        Set<String> expectedSet = new HashSet<>(Arrays.asList(expectedArray));
        System.out.println(expectedSet);
        List<Integer> numbersToValidate = expectedSet
                .stream()
                .map(u -> Integer.parseInt(u))
                .collect(Collectors.toList());
        Set<Integer> expected = new HashSet<>(numbersToValidate);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(expected));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/correctNumbers.csv")
    public void shouldPassValidatingMethodWithValidNumbers(String numbers) throws InvalidNumbersException {
        String[] expectedArray = numbers.split(" ");
        Set<String> expectedSet = new HashSet<>(Arrays.asList(expectedArray));
        System.out.println(expectedSet);
        List<Integer> numbersToValidate = expectedSet
                .stream()
                .map(u -> Integer.parseInt(u))
                .collect(Collectors.toList());
        Set<Integer> expected = new HashSet<>(numbersToValidate);
        gamblingMachine.howManyWins(expected);
        assertEquals(6,expected.size());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/wrongNumbers.csv")
    public void shouldNotCountWins(String numbers) throws InvalidNumbersException {
        String[] expectedArray = numbers.split(" ");
        Set<String> expectedSet = new HashSet<>(Arrays.asList(expectedArray));
        System.out.println(expectedSet);
        List<Integer> numbersToValidate = expectedSet
                .stream()
                .map(u -> Integer.parseInt(u))
                .collect(Collectors.toList());
        Set<Integer> expected = new HashSet<>(numbersToValidate);
        Assertions.assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(expected));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/correctNumbers.csv")
    public void shouldCountWins(String numbers) throws InvalidNumbersException {
        String[] expectedArray = numbers.split(" ");
        Set<String> expectedSet = new HashSet<>(Arrays.asList(expectedArray));
        System.out.println(expectedSet);
        List<Integer> numbersToValidate = expectedSet
                .stream()
                .map(u -> Integer.parseInt(u))
                .collect(Collectors.toList());
        Set<Integer> expectedParsed = new HashSet<>(numbersToValidate);
        assertNotNull(gamblingMachine.howManyWins(expectedParsed));
    }
}