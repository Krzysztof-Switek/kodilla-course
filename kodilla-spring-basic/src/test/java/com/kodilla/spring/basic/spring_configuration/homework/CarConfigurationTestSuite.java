package com.kodilla.spring.basic.spring_configuration.homework;

import com.kodilla.spring.basic.spring_configuration.homework.Car;
import com.kodilla.spring.basic.spring_configuration.homework.CarConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ContextConfiguration(classes = CarConfiguration.class)
class CarConfigurationTestSuite {

    @Autowired
    private Car car;

    @Test
    public void testCarType() {
        String expectedCarType = getExpectedCarType();
        assertEquals(expectedCarType, car.getCarType());
    }

    @Test
    public void testHeadlightsTurnedOn() {
        boolean expectedHeadlightsState = getExpectedHeadlightsState();
        assertEquals(expectedHeadlightsState, car.hasHeadlightsTurnedOn());
    }

    private String getExpectedCarType() {
        int currentMonth = LocalDate.now().getMonthValue();

        if (currentMonth == 12 || currentMonth <= 2) {                // Winter - December, January, February
            return "SUV";
        } else if (currentMonth >= 6 && currentMonth <= 8) {           // Summer - June, July, August
            return "Cabrio";
        } else {                                                        // Spring and Autumn
            return "Sedan";
        }
    }

    private boolean getExpectedHeadlightsState() {
        LocalTime currentTime = LocalTime.now();
        return currentTime.isAfter(LocalTime.of(20, 0)) || currentTime.isBefore(LocalTime.of(6, 0));
    }
}
