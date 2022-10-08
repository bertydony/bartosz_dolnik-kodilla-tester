package com.kodilla.exception.homeork;
import java.util.List;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("Jeden"));
        warehouse.addOrder(new Order("Dwa"));
        warehouse.addOrder(new Order("Trzy"));
        warehouse.addOrder(new Order("Cztery"));

        try {
            Order order = warehouse.getOrder("Sto");
            System.out.println("Znalazlem zamowienie");
        } catch (OrderDoesntExistException e) {
            System.out.println("Nie ma takiego zamowienia");
        }
    }
}