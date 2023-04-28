package com.kodilla.abstracts.homework;

public class Trapezoid extends Shape {
    private double baseA;
    private double baseB;
    private double sideA;
    private double sideB;
    private double height;
    public Trapezoid (double baseA, double baseB, double sideA, double sideB, double height) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }


    @Override
    public double calcArea() {
        return ((baseA+baseB)/2)*height;
    }

    @Override
    public double calcPerimeter() {
        return sideA + sideB + baseA + baseB;
    }
}
