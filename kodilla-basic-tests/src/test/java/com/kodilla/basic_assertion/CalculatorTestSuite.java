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

    @Test                           // powtarzanie kodu dla każdego przypadku jest konieczne?
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
        double a = -2;
        double c = 2;
        double powerResult = calculator.power(a, c);
        assertEquals(-4, powerResult, 2);
    }





}
