package com.kodilla.exception.homeork;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {

    private List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        List<Order> order = orderList
                .stream()
                .filter(n -> n.getNumber().equals(number))
                .collect(Collectors.toList());
        if (order.isEmpty()) {
            throw new OrderDoesntExistException();
        } else {
            return order.get(0);
        }
    }
}