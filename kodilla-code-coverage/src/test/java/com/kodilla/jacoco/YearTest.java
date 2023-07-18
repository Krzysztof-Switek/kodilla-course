package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class YearTest {
    @Test
    public void shouldBeLeapYearIfDivisibleBy400() {

        //given
        Year year = new Year(1600);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }

    @Test
    public void shouldNotBeLeapYearIfDivisibleBy100ButNotBy400() {
        // given
        Year year = new Year(1800);

        // when
        boolean isLeapYear = year.isLeap();

        // then
        assertFalse(isLeapYear);
    }

    @Test
    public void shouldBeLeapYearIfDivisibleBy4ButNotBy100() {
        // given
        Year year = new Year(2020);

        // when
        boolean isLeapYear = year.isLeap();

        // then
        assertTrue(isLeapYear);
    }

    @Test
    public void shouldNotBeLeapYearIfNotDivisibleBy4() {
        // given
        Year year = new Year(2021);

        // when
        boolean isLeapYear = year.isLeap();

        // then
        assertFalse(isLeapYear);
    }

}
