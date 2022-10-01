package com.kodilla.stream;

public class UsersManager {
    public static void main(String[] args) {
        processUsersStream();
    }
    private static void processUsersStream(){
        UseRepository.getUserList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .forEach(username -> System.out.println(username));

    }
    public static String getUserName(User user){
        return user.getUsername();
    }
}
