package com.kodilla.inheritance.homework;

public class WindowsOs extends OperatingSystem {
    public WindowsOs (int releaseYear, String osName ){
        super(releaseYear, osName);

        //System.out.println("WindowsOs constructor");
    }
    @Override
    public void turnOn() {
        System.out.println("Override from windows - Windows 11 is starting up.");
    }

}
