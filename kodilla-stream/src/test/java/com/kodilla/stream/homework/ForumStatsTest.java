package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ForumStatsTest {

    @Test
    void testCalculateAveragePostsForUsersAboveAge() {
        // Given
        List<User> users = Arrays.asList(
                new User("User1", 25, 3, "Group1"),
                new User("User2", 30, 5, "Group2"),
                new User("User3", 40, 10, "Group3"),
                new User("User4", 50, 7, "Group4"),
                new User("User5", 60, 12, "Group5")
        );
        int age = 40;

        // When
        double averagePosts = ForumStats.calculateAveragePostsForUsersAboveAge(users, age);

        // Then
        Assertions.assertEquals(9.6, averagePosts, 0.1);
    }

    @Test
    void testCalculateAveragePostsForUsersAboveAgeNoUsers() {
        // Given
        List<User> users = Arrays.asList();
        int age = 40;

        // When
        double averagePosts = ForumStats.calculateAveragePostsForUsersAboveAge(users, age);

        // Then
        Assertions.assertEquals(0.0, averagePosts);
    }

    @Test
    void testCalculateAveragePostsForUsersBelowAge() {
        // Given
        List<User> users = Arrays.asList(
                new User("User1", 25, 3, "Group1"),
                new User("User2", 30, 5, "Group2"),
                new User("User3", 40, 10, "Group3"),
                new User("User4", 50, 7, "Group4"),
                new User("User5", 60, 12, "Group5")
        );
        int age = 40;

        // When
        double averagePosts = ForumStats.calculateAveragePostsForUsersBelowAge(users, age);

        // Then
        Assertions.assertEquals(4.0, averagePosts);
    }

    @Test
    void testCalculateAveragePostsForUsersBelowAgeNoUsers() {
        // Given
        List<User> users = Arrays.asList();
        int age = 40;

        // When
        double averagePosts = ForumStats.calculateAveragePostsForUsersBelowAge(users, age);

        // Then
        Assertions.assertEquals(0.0, averagePosts);
    }
}
