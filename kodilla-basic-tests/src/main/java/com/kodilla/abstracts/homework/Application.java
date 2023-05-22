package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape square = new Square(4);
        Shape circle = new Circle(2.8);
        Shape trapezoid = new Trapezoid(2,3, 3, 3, 5.5);


   System.out.println ("Square area: " + square.calcArea());
   System.out.println ("Square perimeter: " + square.calcPerimeter());
   System.out.println("Circle area: " + circle.calcArea());             // w jaki sposób mogę ten wynik zaokrąglić do 2 miejsc po przecinku?
   System.out.println("Circle perimeter: " + circle.calcPerimeter());
   System.out.println("Trapezoid perimeter: " + trapezoid.calcArea());
   System.out.println("Trapezoid perimeter: " + trapezoid.calcPerimeter());
    }
}

