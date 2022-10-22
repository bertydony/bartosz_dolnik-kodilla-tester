package com.kodilla.collections.adv.maps;

import java.util.HashMap;
import java.util.Map;

public class BasicMapExample {
    public static void main(String[] args) {
        Map<String, Double> grades = new HashMap<>();
        grades.put("Math", 5.0);
        grades.put("Physics", 4.5);
        grades.put("Philosophy", 4.0);

        double grade = grades.get("Math");
        System.out.println(grade);

        for(Map.Entry<String, Double> note : grades.entrySet()){
            System.out.println("Grades of "+note.getKey()+"is equal of "+note.getValue());
        }
    }
}
