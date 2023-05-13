package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car ford = new Ford();
        Car opel = new Opel();
        Car mazda = new Mazda();

        doRace(ford);
        doRace(opel);
        doRace(mazda);
    }

    public static void doRace(Car car) {
        for (int i = 0; i < 3; i++) {
            car.increaseSpeed();
        }

        for (int i = 0; i < 2; i++) {
            car.decreaseSpeed();
        }

        System.out.println("Prędkość samochodu marki  " + car.getName() + " to " + car.getSpeed() + " km/h.");

    }
}
