package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    private List<Flight> flights;

    public FlightFinder() {
        this.flights = FlightRepository.getFlightsTable();
    }

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> foundFlights = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getDeparture().equals(departure)) {
                foundFlights.add(flight);
            }
        }
        return foundFlights;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> foundFlights = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getArrival().equals(arrival)) {
                foundFlights.add(flight);
            }
        }
        return foundFlights;
    }
}
