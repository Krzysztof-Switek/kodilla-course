package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CarConfiguration.class);
        Car car = context.getBean(Car.class);

        System.out.println("Car Type: " + car.getCarType());
        System.out.println("Headlights turned on: " + car.hasHeadlightsTurnedOn());

        context.close();
    }
}

