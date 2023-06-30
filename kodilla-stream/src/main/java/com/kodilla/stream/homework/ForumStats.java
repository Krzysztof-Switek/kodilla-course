package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {

    public static double calculateAveragePostsForUsersAboveAge(List<User> users, int age) {
        return users.stream()
                .filter(user -> user.getAge() >= age)
                .mapToInt(User::getNumberOfPosts)
                .average()
                .orElse(0.0);
    }

    public static double calculateAveragePostsForUsersBelowAge(List<User> users, int age) {
        return users.stream()
                .filter(user -> user.getAge() < age)
                .mapToInt(User::getNumberOfPosts)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        List<User> users = UsersRepository.getUsersList();

        double averagePostsAboveAge = calculateAveragePostsForUsersAboveAge(users, 40);
        double averagePostsBelowAge = calculateAveragePostsForUsersBelowAge(users, 40);

        System.out.println("Average number of posts for users above age 40: " + averagePostsAboveAge);
        System.out.println("Average number of posts for users below age 40: " + averagePostsBelowAge);
    }
}