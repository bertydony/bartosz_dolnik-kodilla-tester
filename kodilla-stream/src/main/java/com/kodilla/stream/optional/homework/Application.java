package com.kodilla.stream.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Marcin", null));
        students.add(new Student("Michal", new Teacher("Grzesiu")));
        students.add(new Student("Garbys", new Teacher("Grzesiu")));
        students.add(new Student("Antek", new Teacher("Pawel")));

        for (Student student : students) {
            Optional<Teacher> teacher = Optional.ofNullable(student.getTeacher());
            System.out.print("Student: " + student.getName() + " Nauczyciel: ");
            System.out.println(teacher.orElse(new Teacher("<undefined>")).getName());
        }
    }
}