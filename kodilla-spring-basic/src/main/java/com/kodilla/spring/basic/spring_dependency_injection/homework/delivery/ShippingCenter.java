package com.kodilla.spring.basic.spring_dependency_injection.homework.delivery;

import org.springframework.stereotype.Component;

@Component
public class ShippingCenter {

    private DeliveryService deliveryService;

    private NotificationService notificationService;

    public ShippingCenter(DeliveryService deliveryService, NotificationService notificationService) {
        this.deliveryService = deliveryService;
        this.notificationService = notificationService;
    }

    public String sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            return notificationService.success(address);
        }
        return notificationService.fail(address);
    }
}