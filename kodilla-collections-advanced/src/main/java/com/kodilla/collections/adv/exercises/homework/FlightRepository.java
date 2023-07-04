package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("CityA", "CityB"));
        flights.add(new Flight("CityB", "CityC"));
        flights.add(new Flight("CityC", "CityA"));
        return flights;
    }
}