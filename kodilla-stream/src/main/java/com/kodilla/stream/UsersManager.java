package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UseRepository.getUserList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }

    public static List<User> getHigherAge(int age) {
        List<User> users = UseRepository.getUserList()
                .stream()
                .filter(n -> n.getAge() > age)
                .collect(Collectors.toList());
        return users;
    }

    public static List<User> getNumberOfPostsAndGroupFilter(int post, String group) {
        List<User> users = UseRepository.getUserList()
                .stream()
                .filter(n -> n.getNumberOfPost() >= post && n.getGroup().equals(group))
                .collect(Collectors.toList());
        return users;
    }
}