package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Display {
    private String output;

    public void display(double value) {
        output = "The result is: " + value;
        System.out.println(output);
    }

    public void displayError(String errorMessage) {
        output = errorMessage;
        System.err.println(output);
    }

    public String getOutput() {
        return output;
    }
}

