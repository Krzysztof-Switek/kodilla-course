package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);

        List<String> usernamesWithMoreThan1000Posts = filterUsersByNumberOfPosts(1000);
        System.out.println(usernamesWithMoreThan1000Posts);
    }

    static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());                      // [2]

        return usernames;
    }

    // homework 1
    public static List<User> filterUsersByAge(int age) {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
    }
    // homework 1 end
    static List<String> filterUsersByNumberOfPosts(int numberOfPosts) {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPosts() > numberOfPosts)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
    }
    // homework 2




    //homework 2 end

    public static String getUserName(User user) {
        return user.getUsername();
    }
}