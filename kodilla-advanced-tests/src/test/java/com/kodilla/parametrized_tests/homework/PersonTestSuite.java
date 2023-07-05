package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

public class PersonTestSuite {

    @ParameterizedTest
    @MethodSource("giveHeightWeightData")
    public void testGetBMI(double height, double weight, String expected) {
        Person person = new Person(height, weight);
        assertEquals(expected, person.getBMI());
    }

    private static Stream<Arguments> giveHeightWeightData() {
        return Stream.of(
                Arguments.of(1.8, 45, "Very severely underweight"),
                Arguments.of(1.7, 44, "Severely underweight"),
                Arguments.of(1.6, 45, "Underweight"),
                Arguments.of(1.75, 70, "Normal (healthy weight)"),
                Arguments.of(1.8, 90, "Overweight"),
                Arguments.of(1.65, 90, "Obese Class I (Moderately obese)"),
                Arguments.of(1.65, 100, "Obese Class II (Severely obese)"),
                Arguments.of(1.85, 140, "Obese Class III (Very severely obese)"),
                Arguments.of(1.75, 150, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.9, 200, "Obese Class V (Super Obese)"),
                Arguments.of(1.9, 220, "Obese Class VI (Hyper Obese)")
        );
    }
}
