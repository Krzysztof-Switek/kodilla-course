package com.kodilla.collections.adv.maps.complex.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class SchoolDirectory {
    
    public static void main(String[] args) {
        Map<Principal, School> schoolDirectory = new HashMap<>();

        Principal principal1 = new Principal("Marek Samodzielny");
        School school1 = new School("Szkoła Podstawowa nr 24", (Arrays.asList(23, 17, 33, 31, 24, 22, 26)));
                schoolDirectory.put(principal1, school1);

        Principal principal2 = new Principal("Tomasz Skory");
        School school2 = new School("Liceum nr 5", (Arrays.asList(17, 13, 19, 20, 23, 17, 21, 22)));
        schoolDirectory.put(principal2, school2);

        Principal principal3 = new Principal("Joanna Starost");
        School school3 = new School("Szkoła Podstawowa nr 76", (Arrays.asList(27, 23, 28, 19)));
        schoolDirectory.put(principal3, school3);

        for (Map.Entry<Principal, School> entry : schoolDirectory.entrySet()) {
            System.out.println(entry.getKey().getName() + " jest dyrektorem  " + entry.getValue().getName()
                    + " i ma " + entry.getValue().getTotalNumberOfStudents() + " uczniów w szkole.");
        }

    }
}