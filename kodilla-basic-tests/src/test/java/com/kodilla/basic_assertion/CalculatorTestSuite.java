package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        // Given
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        // When
        double sumResult = calculator.sum(a, b);

        // Then
        assertEquals(13, sumResult, 0.01);
    }

    @Test
    public void testSubstract() {
        // Given
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 5;

        // When
        double substractResult = calculator.substract(a, b);

        // Then
        assertEquals(5, substractResult, 0.01);
    }

    @Test
    public void testPower() {
        // Given
        Calculator calculator = new Calculator();
        double a = -5;
        double c = 4;

        // When
        double powerResult = calculator.power(a, c);

        // Then
        assertEquals(625, powerResult, 0.01);
    }
}

