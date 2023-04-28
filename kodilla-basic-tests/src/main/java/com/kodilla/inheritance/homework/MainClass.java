package com.kodilla.inheritance.homework;

public class MainClass {
    public static void main(String[] args) {
        WindowsOs windowsOs = new WindowsOs(2021, "Windows 11");
        windowsOs.systemInfo();
        windowsOs.turnOn();

        //OperatingSystem operatingSystem = new OperatingSystem(2000, "Windows");



        MacOs macOs = new MacOs(2022, "Ventura");
        macOs.systemInfo();
        macOs.turnOn();




    }

}
