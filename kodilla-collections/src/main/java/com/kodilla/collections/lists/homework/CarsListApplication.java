package com.kodilla.collections.lists.homework;
import com.kodilla.collections.arrays.homework.Car;

import java.util.ArrayList;
import java.util.List;
public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();          // carList intelij podpowiada - dlaczego?
        cars.add(new Car("VW", "T4",1997,150));
        cars.add(new Car("Citroen", "Picasso",2020,180));
        cars.add(new Car("Ford", "Fiesta",2006,130));
        cars.add(new Car("Toyota", "Proace",2023,170));

        for (Car addedCars : cars) {
            System.out.println(addedCars);
        }

        // usuwam T4
        cars.remove(0);
        System.out.println(cars);

        // usuwam toyota
        Car carToRemove = new Car("Toyota", "Proace",2023,170);
        cars.remove(carToRemove);
        System.out.println(cars);
        System.out.println("Długość listy cars to: " + cars.size());

    }
}

