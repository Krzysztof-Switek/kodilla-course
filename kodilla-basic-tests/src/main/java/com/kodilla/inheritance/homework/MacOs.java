package com.kodilla.inheritance.homework;

import javax.crypto.Mac;

public class MacOs extends OperatingSystem{
    public MacOs (int releaseYear, String osName ){
        super(releaseYear, osName);

       // System.out.println("MacOs constructor");
    }
    @Override
    public void turnOn() {
        System.out.println("Override from mac - Ventura is starting up.");
    }
}
