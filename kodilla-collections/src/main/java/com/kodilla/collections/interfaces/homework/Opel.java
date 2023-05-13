package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    private int speed;
    private String name;
    public Opel() {
        this.speed = 0;
        this.name = "Opel";
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 15;

    }

    @Override
    public void decreaseSpeed() {
        speed -= 10;
    }
    @Override
    public  String getName(){
        return name;
    }
}
