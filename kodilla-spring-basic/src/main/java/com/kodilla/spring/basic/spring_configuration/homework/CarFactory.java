package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Random;


@Configuration
public class CarFactory {
    enum Seasons {
        SPRING,
        SUMMER,
        AUTUMN,
        WINTER
    }

    Seasons seasons;
    Car car;

    @Bean
    public SUV createSuv() {
        return new SUV();
    }

    @Bean
    public Cabrio createCabrio() {
        return new Cabrio();
    }

    @Bean
    public Sedan createSedan() {
        return new Sedan();
    }

    @Bean
    @Primary
    public Car getCar() {
        Random random = new Random();
        int seasonNumber = random.nextInt(4);
        switch (seasonNumber) {
            case 0:
                seasons = Seasons.WINTER;
                car = new SUV();
                break;
            case 1:
                seasons = Seasons.SUMMER;
                car = new Cabrio();
                break;
            case 2:
                seasons = Seasons.AUTUMN;
                car = new Sedan();
                break;
            case 3:
                seasons = Seasons.SPRING;
                car = new Sedan();
                break;
        }
        car.turnLightOnOff();
        return car;
    }
}
