package com.kodilla.collections.interfaces;

public class Circle implements Shape {
    private double radius;

    public Circle (double radius) {         // konstruktor inicjuje pole z promieniem koła "radius"
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return Math.PI * radius;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
