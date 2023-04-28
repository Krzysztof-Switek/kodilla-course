package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private double sideLength;


    public Square (double sideLength) {
        this.sideLength = sideLength;

    }

    @Override
    public double calcArea() {

        return sideLength * sideLength;
    }

    @Override
    public double calcPerimeter() {
        return sideLength * 4;
    }
}
