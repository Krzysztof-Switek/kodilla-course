package com.kodilla.exeption;

public class ThirdExample {
    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();
        try {
            boolean isVienaInUse = airportRepository.isAirportInUse("Viena");
            System.out.println("Viena status: " + isVienaInUse);
        } catch (AirportNotFoundExeption e) {
            System.out.println("Sorry, this airport can not be served by our Airlines");
            } finally {
            System.out.println("Thank you for using kodilla Airlines");
        }
    }
}
