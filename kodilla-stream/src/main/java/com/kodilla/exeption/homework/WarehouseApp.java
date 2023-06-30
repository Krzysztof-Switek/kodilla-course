package com.kodilla.exeption.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Order order1 = new Order("OR123");
        Order order2 = new Order("OR456");
        warehouse.addOrder(order1);
        warehouse.addOrder(order2);

        try {
            Order foundOrder = warehouse.getOrder("OR123");
            System.out.println("Order: " + foundOrder.getNumber() + " exists");
        } catch (OrderDoesNotExistException e) {
            System.out.println(e.getMessage());
        }

        try {
            Order notFoundOrder = warehouse.getOrder("OR789");
            System.out.println("Order: " + notFoundOrder.getNumber() + " exists");
        } catch (OrderDoesNotExistException e) {
            System.out.println(e.getMessage());
        }
    }
}
