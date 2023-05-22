package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();

        stamps.add(new Stamp("Znaczek 1", "20x20", true));
        stamps.add(new Stamp("Znaczek 2", "20x20", false));
        stamps.add(new Stamp("Znaczek 3", "20x40", true));
        stamps.add(new Stamp("Znaczek 1", "20x20", true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}

