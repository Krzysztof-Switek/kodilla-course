package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        double sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubstract() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 5;
        double substractResult = calculator.substract(a, b);
        assertEquals(5, substractResult);
    }

    @Test
    public void testPower() {
        Calculator calculator = new Calculator();
        double a = -5;
        double c = 4;
        double powerResult = calculator.power(a, c);
        assertEquals(625, powerResult, 0.01);
    }





}
