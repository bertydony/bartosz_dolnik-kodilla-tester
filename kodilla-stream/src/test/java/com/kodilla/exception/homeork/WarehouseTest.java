package com.kodilla.exception.homeork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {

    @Test
    void getOrderTest() {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("Jeden"));
        warehouse.addOrder(new Order("Dwa"));
        warehouse.addOrder(new Order("Trzy"));
        warehouse.addOrder(new Order("Cztery"));

        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("Stoo"));
    }
}