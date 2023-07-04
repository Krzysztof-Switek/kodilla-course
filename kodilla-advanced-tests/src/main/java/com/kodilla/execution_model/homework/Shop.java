package com.kodilla.execution_model.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Shop {
    private List<Order> orders;

    public Shop() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(double value, Date date) {
        Order order = new Order(value, date);
        orders.add(order);
    }

    public List<Order> ordersListBetweenTwoDates(Date startDate, Date endDate) {
        List<Order> filteredOrders = new ArrayList<>();
        for (Order order : orders) {
            if (order.getDate().after(startDate) && order.getDate().before(endDate)) {
                filteredOrders.add(order);
            }
        }
        return filteredOrders;
    }

    public List<Order> ordersListBasedOnMinAndMaxValues(double minValue, double maxValue) {
        List<Order> filteredOrders = new ArrayList<>();
        for (Order order : orders) {
            if (order.getValue() >= minValue && order.getValue() <= maxValue) {
                filteredOrders.add(order);
            }
        }
        return filteredOrders;
    }

    public int allOrdersList() {
        return orders.size();
    }

    public double sumOfAllOrders() {
        double totalValue = 0;
        for (Order order : orders) {
            totalValue += order.getValue();
        }
        return totalValue;
    }

    public static void main(String[] args) {
        // Tworzenie obiektu sklepu
        Shop shop = new Shop();

        // Dodawanie zamówień
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date date1 = dateFormat.parse("01-01-2022");
            Date date2 = dateFormat.parse("15-01-2022");
            Date date3 = dateFormat.parse("20-01-2022");
            shop.addOrder(100, date1);
            shop.addOrder(200, date2);
            shop.addOrder(150, date3);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Pobieranie zamówień z zakresu dat
        try {
            Date startDate = dateFormat.parse("01-01-2022");
            Date endDate = dateFormat.parse("31-01-2022");
            List<Order> ordersBetweenTwoDates = shop.ordersListBetweenTwoDates(startDate, endDate);
            for (Order order : ordersBetweenTwoDates) {
                System.out.println("Value: " + order.getValue() + ", Date: " + dateFormat.format(order.getDate()));
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Pobieranie zamówień z zakresu wartości
        double minValue = 100;
        double maxValue = 200;
        List<Order> ordersBasedOnMinAndMaxValues = shop.ordersListBasedOnMinAndMaxValues(minValue, maxValue);
        for (Order order : ordersBasedOnMinAndMaxValues) {
            System.out.println("Value: " + order.getValue() + ", Date: " + dateFormat.format(order.getDate()));
        }

        // Zwracanie liczby zamówień
        int orderCount = shop.allOrdersList();
        System.out.println("Total orders: " + orderCount);

        // Zwracanie sumy wartości zamówień
        double totalOrderValue = shop.sumOfAllOrders();
        System.out.println("Total order value: " + totalOrderValue);
    }
}
