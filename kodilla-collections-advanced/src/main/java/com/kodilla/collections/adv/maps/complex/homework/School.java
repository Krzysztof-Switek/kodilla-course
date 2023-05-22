package com.kodilla.collections.adv.maps.complex.homework;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(name, school.name) && Objects.equals(numberOfStudentsInClasses, school.numberOfStudentsInClasses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberOfStudentsInClasses);
    }
}
