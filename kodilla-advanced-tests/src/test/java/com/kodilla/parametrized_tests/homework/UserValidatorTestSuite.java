package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

class UserValidatorTestSuite {

    private final UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"KrzychuSwitek", "Tareusz.Morawski", "123-username", "user_name"})
    public void shouldValidateUsername(String username) {
        assertTrue(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"user@domain.com", "pinus2233@mail.co.uk", "anna-mawia.jopek@music.org"})
    public void shouldValidateEmail(String email) {
        assertTrue(validator.validateEmail(email));
    }
}


