package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FlightFinderTest {

    @Test
    public void testFindFlightsFrom() {
        FlightFinder flightFinder = new FlightFinder();

        List<Flight> flightsFromCityA = flightFinder.findFlightsFrom("CityA");
        Assertions.assertEquals(1, flightsFromCityA.size());

        List<Flight> flightsFromCityB = flightFinder.findFlightsFrom("CityB");
        Assertions.assertEquals(1, flightsFromCityB.size());

        List<Flight> flightsFromCityC = flightFinder.findFlightsFrom("CityC");
        Assertions.assertEquals(1, flightsFromCityC.size());

        List<Flight> flightsFromCityD = flightFinder.findFlightsFrom("CityD");
        Assertions.assertEquals(0, flightsFromCityD.size());
    }

    @Test
    public void testFindFlightsTo() {
        FlightFinder flightFinder = new FlightFinder();

        List<Flight> flightsToCityA = flightFinder.findFlightsTo("CityA");
        Assertions.assertEquals(1, flightsToCityA.size());

        List<Flight> flightsToCityB = flightFinder.findFlightsTo("CityB");
        Assertions.assertEquals(1, flightsToCityB.size());

        List<Flight> flightsToCityC = flightFinder.findFlightsTo("CityC");
        Assertions.assertEquals(1, flightsToCityC.size());
    }

}