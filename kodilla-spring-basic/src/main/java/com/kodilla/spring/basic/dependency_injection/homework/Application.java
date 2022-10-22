package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {
    public static void main(String[] args) {
        DeliveryService deliveryServices = new DeliveryService();
        NotificationService notificationServices = new NotificationService();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryServices, notificationServices);
        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
    }
}