package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ShopTestSuite {

    private Shop shop;

    @BeforeEach
    public void setUp() {
        shop = new Shop();
    }

    @Test
    public void testAddOrder() {
        // Given
        double value = 100;
        Date date = new Date();

        // When
        shop.addOrder(value, date);

        // Then
        int expectedOrderCount = 1;
        int actualOrderCount = shop.allOrdersList();
        Assertions.assertEquals(expectedOrderCount, actualOrderCount);
    }

    @Test
    public void testOrdersListBetweenTwoDates() throws ParseException {
        // Given
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date startDate = dateFormat.parse("01-01-2023");
        Date endDate = dateFormat.parse("31-01-2023");

        Date date1 = dateFormat.parse("02-01-2023");
        Date date2 = dateFormat.parse("15-01-2023");
        Date date3 = dateFormat.parse("20-01-2023");

        shop.addOrder(100, date1);
        shop.addOrder(200, date2);
        shop.addOrder(150, date3);

        // When
        List<Order> filteredOrders = shop.ordersListBetweenTwoDates(startDate, endDate);

        // Then
        int expectedOrderCount = 3;
        int actualOrderCount = filteredOrders.size();
        Assertions.assertEquals(expectedOrderCount, actualOrderCount);
    }

    @Test
    public void testOrdersListBasedOnMinAndMaxValues() {
        // Given
        double minValue = 100;
        double maxValue = 200;

        shop.addOrder(100, new Date());
        shop.addOrder(150, new Date());
        shop.addOrder(250, new Date());

        // When
        List<Order> filteredOrders = shop.ordersListBasedOnMinAndMaxValues(minValue, maxValue);

        // Then
        int expectedOrderCount = 2;
        int actualOrderCount = filteredOrders.size();
        Assertions.assertEquals(expectedOrderCount, actualOrderCount);
    }

    @Test
    public void testAllOrdersList() {

        shop.addOrder(100, new Date());
        shop.addOrder(150, new Date());
        shop.addOrder(200, new Date());

        // When
        int expectedOrderCount = 3;
        int actualOrderCount = shop.allOrdersList();

        // Then
        Assertions.assertEquals(expectedOrderCount, actualOrderCount);
    }

    @Test
    public void testSumOfAllOrders() {
        shop.addOrder(100, new Date());
        shop.addOrder(150, new Date());
        shop.addOrder(200, new Date());

        // When
        double expectedTotalValue = 450;
        double actualTotalValue = shop.sumOfAllOrders();

        // Then
        Assertions.assertEquals(expectedTotalValue, actualTotalValue);
    }
}
