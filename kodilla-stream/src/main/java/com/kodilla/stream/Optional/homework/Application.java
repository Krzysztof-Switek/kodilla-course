package com.kodilla.stream.Optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Teacher teacherMath = new Teacher("Kowalski Jan");
        Teacher teacherChemistry = new Teacher("Słodowa Anna");
        Teacher teacherBiology = new Teacher("Skibiński Dariusz");
        Teacher teacherMusic = new Teacher("Sumka Daria");

        students.add(new Student("Adam", teacherBiology));
        students.add(new Student("Beata", teacherChemistry));
        students.add(new Student("Darek", teacherMusic));
        students.add(new Student("Kacper", teacherMath));
        students.add(new Student("Monika", null));
        students.add(new Student("Sylwia", null));
        students.add(new Student("Ewa", teacherMusic));
        students.add(new Student("Tomek", null));


        for (Student student : students) {
            String studentName = student.getName();
            Optional<Teacher> teacherOptional = Optional.ofNullable(student.getTeacher());
            String teacherName = teacherOptional.map(Teacher::getName).orElse("<undefined>");

            System.out.println("Uczeń: " + studentName + ", nauczyciel: " + teacherName);
        }
    }
}
