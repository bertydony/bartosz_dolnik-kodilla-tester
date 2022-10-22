package com.kodilla.spring.basic.spring_dependency_injection.homework.delivery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTest {

    @Test
    public void ShouldSendPackage(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String sendPackage = bean.sendPackage("New York", 20);
        Assertions.assertEquals("Package delivered to: New York", sendPackage);
    }

    @Test
    public void ShouldNotSendPackage(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String sendPackage = bean.sendPackage("New York", 50);
        Assertions.assertEquals("Package not delivered to: New York", sendPackage);
    }
}