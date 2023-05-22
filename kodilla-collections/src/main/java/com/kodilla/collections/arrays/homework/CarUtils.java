package com.kodilla.collections.arrays.homework;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("Car details:");
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year of production: " + car.getYear());
        System.out.println("Current speed: " + car.getSpeed() + " km/h");
    }
}