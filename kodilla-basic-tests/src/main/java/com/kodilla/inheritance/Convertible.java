package com.kodilla.inheritance;
public class Convertible extends Car {
    public Convertible(int wheels, int seats) {
        super(wheels, seats);
        System.out.println("Convertible constructor");
    }
    public void openRoof() {
        System.out.println("Opening roof - metoda klasy Convertible");
    }
    public void closeRoof() {
        System.out.println("Closing roof - metoda klasy Convertible");
    }
    @Override
    public void openDoors() {
        System.out.println("Opening 2 doors - nadpisana metoda klasy convertible");      // override - nadpisujemy metodę odziedziczoną z klasy nadrzędnej
    }
}