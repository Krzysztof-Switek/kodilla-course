package com.kodilla.inheritance;

public class Application {
    public static void main(String[] args) {

        Car car = new Car(4,5); // tworzymy obiekt klasy Car ale zmiennych nie możemy urzyć - są prywatne
        car.turnOnLights();

        // tworzymy obiekt klasy Convertible - metody tej klasy są publiczne więc możemy je urzyć
        Convertible convertible = new Convertible(4,2);
        convertible.turnOnLights();
        convertible.openRoof();
        convertible.closeRoof();
        System.out.println(convertible.getSeats());
        convertible.displayNumberOfSeats();
    }
}
