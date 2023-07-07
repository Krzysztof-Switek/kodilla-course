package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTest {

    @Autowired
    private Calculator calculator;

    @Autowired
    private Display display;

    @Test
    public void testAdd() {
        calculator.add(3, 4);
        String expectedOutput = "The result is: 7.0";
        assertEquals(expectedOutput, display.getOutput());
    }

    @Test
    public void testSubtract() {
        calculator.subtract(9, 4);
        String expectedOutput = "The result is: 5.0";
        assertEquals(expectedOutput, display.getOutput());
    }

    @Test
    public void testMultiply() {
        calculator.multiply(2, 5);
        String expectedOutput = "The result is: 10.0";
        assertEquals(expectedOutput, display.getOutput());
    }

    @Test
    public void testDivide() {
        calculator.divide(10, 2);
        String expectedOutput = "The result is: 5.0";
        assertEquals(expectedOutput, display.getOutput());
    }

    @Test
    public void testDivideByZero() {
        calculator.divide(5, 0);
        String expectedOutput = "Error: Division by zero!";
        assertEquals(expectedOutput, display.getOutput());
    }
}
