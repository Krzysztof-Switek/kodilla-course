package com.kodilla.spring.basic.spring_dependency_injection.homework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ShippingCenterTest {

    @Autowired
    private ShippingCenter shippingCenter;

    @Test
    public void testSendPackageSuccess() {
        String address = "Szczęśliwa 42/8 Gdańsk ";
        double weight = 18.2;

        String result = shippingCenter.sendPackage(address, weight);

        assertEquals("Package delivered to: " + address, result);
    }

    @Test
    public void testSendPackageFailure() {
        String address = "Szczęśliwa 42/8 Gdańsk";
        double weight = 35.0;

        String result = shippingCenter.sendPackage(address, weight);

        assertEquals("Package not delivered to: " + address, result);
    }
}
