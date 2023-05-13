package com.kodilla.collections.interfaces.homework;

public class Mazda implements Car{
    private int speed;
    private String name;
    public Mazda() {
        this.speed = 0;
        this.name = "Mazda";
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 25;

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