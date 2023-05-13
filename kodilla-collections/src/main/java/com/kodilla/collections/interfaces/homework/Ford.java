package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{
    private int speed;
    private String name;
    public Ford() {
        this.speed = 0;
        this.name = "Ford";
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 20;

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
