package com.kodilla.inheritance;    // KLASA BAZOWA
public class Car {
    private int wheels;     // zmienna prywatna - nazwaObiektu.nazwaZmiennej nie zadziała!
    private int seats;      // zmienna prywatna widoczna TYLKO wewnątrz tej klasy, w której została zdefiniowana
    public Car(int wheels,int seats) {      // konstruktor obiektu klasy Car
        System.out.println("Car constructor");
        this.wheels = wheels;
        this.seats = seats;
    }
    public void turnOnLights() {
        System.out.println("Lights were turned on - metoda klasy Car");
    }
    public void openDoors() {
        System.out.println("Opening 4 doors - metoda klasy Car");
    }
    public void displayNumberOfSeats() {
        System.out.println("Number of seats: " + seats);
    }
    public int getWheels() {
        return wheels;
    }
    public int getSeats() {
        return seats;
    }
}
