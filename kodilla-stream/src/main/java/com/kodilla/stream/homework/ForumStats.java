package com.kodilla.stream.homework;
import com.kodilla.stream.UseRepository;
import java.util.Collections;
import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
        System.out.println("Srednia ilosci posto dla uzytkownikow starszych od 40 lat: "+avg1());
        System.out.println("Srednia ilosci postow dla uzytkownikow mlodszych od 40 lat: "+avg2());
    }
    public static double avg1(){
       return UseRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
    }

    public static double avg2(){
        return UseRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
    }
}