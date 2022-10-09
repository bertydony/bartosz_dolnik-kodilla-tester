package com.kodilla.stream.homework;

import com.kodilla.stream.UseRepository;
import com.kodilla.stream.User;

import java.util.Collections;
import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
        ForumStats forumStats = new ForumStats();
        System.out.println("Srednia ilosci posto dla uzytkownikow starszych od 40 lat: " + forumStats.averageOfUsersAgeHigherThanForty(UseRepository.getUserList()));
        System.out.println("Srednia ilosci postow dla uzytkownikow mlodszych od 40 lat: " + forumStats.averageOfUserAgeLowerThanForty(UseRepository.getUserList()));
    }

    public double averageOfUsersAgeHigherThanForty(List<User> users) {
        return users
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
    }

    public double averageOfUserAgeLowerThanForty(List<User> users) {
        return users
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
    }
}