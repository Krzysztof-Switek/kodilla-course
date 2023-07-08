package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class ClockTestSuite {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testClockBeanScope() {
        Clock firstClock = applicationContext.getBean(Clock.class);
        Clock secondClock = applicationContext.getBean(Clock.class);

        assertNotEquals(firstClock.getCurrentTime(), secondClock.getCurrentTime());
    }
}