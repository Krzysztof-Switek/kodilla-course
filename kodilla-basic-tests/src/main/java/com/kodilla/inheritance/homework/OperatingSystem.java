package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int releaseYear;
    private String osName;

    public OperatingSystem(int releaseYear, String osName) {
        //System.out.println ("konstruktor operatingSystem");              wydaje mi się że to przekombinowałem ;)
        this.releaseYear = releaseYear;
        this.osName = osName;
    }

    public void systemInfo() {
        System.out.println("System name: " + osName + "\nSystem release year: " + releaseYear);
    }

    public void turnOn() {
        System.out.println(osName + " is ON - metoda turnOn Klasy OpereatingSystem");
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getOsName() {
        return osName;
    }
}
