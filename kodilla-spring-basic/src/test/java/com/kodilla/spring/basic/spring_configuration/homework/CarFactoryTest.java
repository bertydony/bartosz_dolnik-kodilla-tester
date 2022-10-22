
package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CarFactoryTest {


    @Test
    public void shouldCreateSuv() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        SUV suv = context.getBean(SUV.class);
        String carType = suv.getCarType();
        Assertions.assertEquals("SUV", carType);
    }

    @Test
    public void shouldCreateSuvBeanAndFetchByBeanName() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        SUV suv = (SUV) context.getBean("createSuv");
        String carType = suv.getCarType();
        Assertions.assertEquals("SUV", carType);
    }

    @Test
    public void shouldCreateCarBeanByRandomSeason() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("getCar");
        String carType = car.getCarType();
        List<String> possibleCarTypes = Arrays.asList("Suv", "Sedan", "Cabrio");
        Assertions.assertTrue(possibleCarTypes.contains(carType));

    }

    @Test
    public void shouldTurnOnHeadLightsDependedOnHour() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("getCar");
        car.turnLightOnOff();
        boolean headlightsOn = car.hasHeadlightsTurnedOn();
        List<Boolean> headlightOnOff = Arrays.asList(true, false);
        Assertions.assertTrue(headlightOnOff.contains(headlightsOn));
    }
}