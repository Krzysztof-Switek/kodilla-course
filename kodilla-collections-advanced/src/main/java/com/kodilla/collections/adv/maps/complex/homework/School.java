package com.kodilla.collections.adv.maps.complex.homework;

import java.util.List;

public class School {
    private final String name;
    private final List<Integer> numberOfStudentsInClasses;

    public School(String name, List<Integer> numberOfStudentsInClasses) {
        this.name = name;
        this.numberOfStudentsInClasses = numberOfStudentsInClasses;
    }

    public String getName() {
        return name;
    }

    public int getTotalNumberOfStudents() {
        int total = 0;
        for (int numberOfStudents : numberOfStudentsInClasses) {
            total += numberOfStudents;
        }
        return total;
    }
}
