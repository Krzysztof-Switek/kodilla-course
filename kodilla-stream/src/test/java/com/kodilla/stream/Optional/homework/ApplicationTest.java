package com.kodilla.stream.Optional.homework;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Optional;

public class ApplicationTest {
    @Test
    void displayStudentTeacherPairs() {
        // Given
        List<Student> students = List.of(
                new Student("Anna", new Teacher("Kowalski Jan")),
                new Student("Karol", new Teacher("Sumka Daria")),
                new Student("Bartek", new Teacher("Słodowa Anna")),
                new Student("Olga", null),
                new Student("Sylwia", new Teacher("Słodowa Anna"))
        );

        // When
        StringBuilder output = new StringBuilder();
        for (Student student : students) {
            String studentName = student.getName();
            Optional<Teacher> teacherOptional = Optional.ofNullable(student.getTeacher());
            String teacherName = teacherOptional.map(Teacher::getName).orElse("<undefined>");

            output.append("Uczeń: ").append(studentName).append(", nauczyciel: ").append(teacherName).append("\n");
        }

        // Then
        String expectedOutput =
                "Uczeń: Anna, nauczyciel: Kowalski Jan\n" +
                        "Uczeń: Karol, nauczyciel: Sumka Daria\n" +
                        "Uczeń: Bartek, nauczyciel: Słodowa Anna\n" +
                        "Uczeń: Olga, nauczyciel: <undefined>\n" +
                        "Uczeń: Sylwia, nauczyciel: Słodowa Anna\n";

        Assertions.assertEquals(expectedOutput, output.toString());
    }
}
