package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSource {
    private static Stream<Arguments> sourceForPersonTest() {
        return Stream.of(
                Arguments.of(new Person(1.80, 85)),
                Arguments.of(new Person(1.55, 120)),
                Arguments.of(new Person(1.65, 57)),
                Arguments.of(new Person(1.60, 52)),
                Arguments.of(new Person(1.95, 40))
        );
    }

    private static Stream<Arguments> wrongDataForPersonTest() {
        return Stream.of(
                Arguments.of(new Person(0, 50)),
                Arguments.of(new Person(0, 0)),
                Arguments.of(new Person(1.80, 0))

        );
    }
}