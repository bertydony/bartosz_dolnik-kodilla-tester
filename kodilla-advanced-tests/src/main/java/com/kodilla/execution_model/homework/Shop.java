package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

    Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> getOrdersByDate(LocalDate dateFrom, LocalDate dateTo) {
        List<Order> ordersByDate = orders
                .stream()
                .filter(u -> u.getDate().isAfter(dateFrom.minusDays(1)))
                .filter(n -> n.getDate().isBefore(dateTo.plusDays(1)))
                .collect(Collectors.toList());
        if (ordersByDate.isEmpty()) {
            return null;
        } else
            return ordersByDate;
    }

    public List<Order> getOrdersByMinMax(double minValue, double maxValue) {
        List<Order> orderByValue = orders
                .stream()
                .filter(u -> u.getOrderValue() >= minValue)
                .filter(n -> n.getOrderValue() <= maxValue)
                .collect(Collectors.toList());
        if (orderByValue.isEmpty()) {
            return null;
        }
        return orderByValue;
    }

    public int getSize() {
        return orders.size();
    }

    public double sumOrders() {
        if (orders.size() == 0) {
            return 0;
        }
        double sum = 0;
        for (Order order : this.orders) {
            sum += order.getOrderValue();
        }
        return sum;
    }

    public void clear() {
        orders.clear();
    }

}