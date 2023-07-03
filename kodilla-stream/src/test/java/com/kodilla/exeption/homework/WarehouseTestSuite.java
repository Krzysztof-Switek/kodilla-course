package com.kodilla.exeption.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class WarehouseTestSuite {
    @Test
    public void testShouldThrow_OrderDoesNotExist_Exception() {
        // given
        Warehouse warehouse = new Warehouse();
        Order order1 = new Order("OR123");
        Order order2 = new Order("OR456");
        warehouse.addOrder(order1);
        warehouse.addOrder(order2);

        // when & then
        assertThrows(OrderDoesNotExistException.class, () -> {
            warehouse.getOrder("OR789");
        });
    }

    @Test
    public void testShouldNotThrow_OrderDoesNotExist_Exception() {
        //given
        Warehouse warehouse = new Warehouse();
        //when
        //then
        assertThrows(OrderDoesNotExistException.class, () ->
                warehouse.getOrder("OR789"));
    }
}

