package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSource#sourceForPersonTest")
    public void shouldCalculateBMI(Person person) {
        Stream<String> expected = Stream.of("Overweight","Obese Class V (Super Obese)",
                "Normal (healthy weight)","Normal (healthy weight)",
                "Very severely underweight","Obese Class IV (Morbidly Obese)");
        boolean match = expected.anyMatch(n -> n.equals(person.getBMI()));
        assertTrue(match);

    }
}
