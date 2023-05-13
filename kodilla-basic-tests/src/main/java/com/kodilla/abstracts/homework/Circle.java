package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    private double radius;
    // final double PI = 3.141592

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
       return Math.PI * radius * radius;
    }

    @Override
    public double calcPerimeter() {
        return Math.PI * radius ;
    }
}