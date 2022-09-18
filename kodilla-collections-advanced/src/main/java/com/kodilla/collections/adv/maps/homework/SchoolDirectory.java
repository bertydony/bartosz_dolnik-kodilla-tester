package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();
        Principal mark = new Principal("Mark", "Zuckenberg");
        Principal ben = new Principal("Ben", "Malinowski");
        Principal adam = new Principal("Adam", "Grey");

        School markSchool = new School(Arrays.asList(22.0, 24.0, 23.0, 18.0));
        School benSchool = new School(Arrays.asList(19.0, 20.0, 21.0, 16.0));
        School adamSchool = new School(Arrays.asList(25.0, 22.0, 21.0, 17.0));

        school.put(mark, markSchool);
        school.put(ben, benSchool);
        school.put(adam, adamSchool);

        for(Map.Entry<Principal, School> princialEntry : school.entrySet()) {
            System.out.println(princialEntry.getKey().getFirstname() + ", " + princialEntry.getKey().getLastname() + ", Number of students in classes: " + princialEntry.getValue());
        }
    }
}
