package com.kodilla.collections.arrays.homework;
import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.arrays.homework.Car;

import java.util.Random;

public class CarsApplication {
    public static Car drawCar() {
        Random random = new Random();
        String[] brands = {"Ford", "Toyota", "Honda", "BMW", "Mercedes", "Fiat"};
        String[] models = {"Mustang", "Camry", "Civic", "X5", "E-Class", "Panda"};
        int[] years = {2015, 2017, 2019, 2020, 2022, 2019};
        int randomIndex = random.nextInt(brands.length);
        String brand = brands[randomIndex];
        String model = models[randomIndex];
        int year = years[randomIndex];
        int speed = random.nextInt(200) + 1;
        return new Car(brand, model, year, speed);
    }

    public static void main(String[] args) {
        Random random = new Random();
        int arraySize = random.nextInt(15) + 1;
        Car[] cars = new Car[arraySize];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
        }

        for (Car car : cars) {
            CarUtils.describeCar(car);
            System.out.println();
        }
    }
}