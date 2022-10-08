package com.kodilla.stream.optional.homework;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        Teacher teacher0 = new Teacher("Grzesiu");
        Teacher teacher1 = new Teacher("Pawel");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Marcin", null));
        students.add(new Student("Michal", teacher0 ));
        students.add(new Student("Garbys", teacher0));
        students.add(new Student("Antek", teacher1));

        for(Student student:students){
            Optional<Teacher> teacher = Optional.ofNullable(student.getTeacher());
            System.out.print("Student: "+ student.getName()+ " Nauczyciel: ");
            System.out.println(teacher.orElse(new Teacher("<undefined>")).getName());
        }
    }
}
