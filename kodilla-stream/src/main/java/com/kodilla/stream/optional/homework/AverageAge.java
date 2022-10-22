package com.kodilla.stream.optional.homework;

import com.kodilla.stream.UseRepository;

public class AverageAge {
    public static void main(String[] args) {
        double avg = UseRepository.getUserList()
                .stream()
                .mapToInt(n -> n.getAge())
                .average()
                .getAsDouble();
        System.out.println(avg);
    }
}
