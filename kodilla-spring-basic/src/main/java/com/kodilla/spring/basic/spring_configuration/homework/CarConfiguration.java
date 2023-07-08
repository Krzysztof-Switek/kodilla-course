package com.kodilla.spring.basic.spring_configuration.homework;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;

@Configuration
public class CarConfiguration {
    @Bean
    public Car getCar() {
        LocalDate currentDate = LocalDate.now();
        int currentMonth = currentDate.getMonthValue();
        LocalTime currentTime = LocalTime.now();
        int currentHour = currentTime.getHour();

        if (currentMonth == 12 || currentMonth <= 2) { // Zima - grudzień, styczeń, luty
            return new SUV();
        } else if (currentMonth >= 6 && currentMonth <= 8) { // Lato - czerwiec, lipiec, sierpień
            return new Cabrio();
        } else { // Wiosna i jesień
            return new Sedan();
        }
    }
}

