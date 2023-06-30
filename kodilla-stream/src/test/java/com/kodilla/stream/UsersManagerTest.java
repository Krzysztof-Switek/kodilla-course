package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;

class UsersManagerTest {

    @Test
    void testFilterChemistGroupUsernames() {
        // Given
        List<String> expectedUsernames = List.of("Hannah Holden", "Oswald Keller");

        // When
        List<String> chemistGroupUsernames = UsersManager.filterChemistGroupUsernames();

        // Then
        Assertions.assertEquals(expectedUsernames, chemistGroupUsernames);
    }

    @Test
    void testFilterUsersByAge() {
        // Given
        int ageThreshold = 40;

        // When
        List<User> filteredUsers = UsersManager.filterUsersByAge(ageThreshold);

        // Then
        for (User user : filteredUsers) {
            Assertions.assertTrue(user.getAge() > ageThreshold);
        }
    }

    @Test
    void testFilterUsersByAgeManually() {
        // Given
        int ageThreshold = 40;

        // Tworzenie użytkowników ręcznie o wieku większym niż 40
        List<User> manuallyFilteredUsers = new ArrayList<>();
        manuallyFilteredUsers.add(new User("Hannah Holden", 50, 7, "Chemists"));
        manuallyFilteredUsers.add(new User("Ursula Menzie", 49, 0, "Board"));
        manuallyFilteredUsers.add(new User("Oswald Keller", 44, 2, "Chemists"));
        manuallyFilteredUsers.add(new User("Wilbur Nunez", 57, 0, "Security"));


        // When
        List<User> filteredUsers = UsersManager.filterUsersByAge(ageThreshold);

        // Then
        Assertions.assertEquals(manuallyFilteredUsers.size(), filteredUsers.size());

        // Sprawdzenie, czy każdy użytkownik z listy ręcznie utworzonej występuje na liście zwróconej przez metodę
        for (User manuallyFilteredUser : manuallyFilteredUsers) {
            Assertions.assertTrue(filteredUsers.contains(manuallyFilteredUser));
        }
    }


    @Test
    void testFilterUsersByNumberOfPosts() {
        // Given
        int numberOfPostsThreshold = 1000;

        // When
        List<String> filteredUsernames = UsersManager.filterUsersByNumberOfPosts(numberOfPostsThreshold);

        // Then
        Assertions.assertEquals(1, filteredUsernames.size());
        Assertions.assertEquals("Larry Hunter", filteredUsernames.get(0));
    }
}
