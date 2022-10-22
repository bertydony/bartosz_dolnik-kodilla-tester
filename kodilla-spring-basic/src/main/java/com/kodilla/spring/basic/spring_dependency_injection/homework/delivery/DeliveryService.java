package com.kodilla.spring.basic.spring_dependency_injection.homework.delivery;

import org.springframework.stereotype.Component;

@Component
public class DeliveryService {
    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            return false;
        }
        return true;
    }
}