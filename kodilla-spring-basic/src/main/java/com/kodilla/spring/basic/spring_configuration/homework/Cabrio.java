package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;
import java.util.Random;

public class Cabrio implements Car {
    boolean lightsOnOff;

    @Override
    public boolean hasHeadlightsTurnedOn(){
        return lightsOnOff;
    }

    @Override
    public boolean turnLightOnOff() {
        Random random = new Random();
        int hour = random.nextInt(25);
        if (hour >= 6 && hour <= 20) {
            lightsOnOff = false;
        } else {
            lightsOnOff = true;
        }
        return this.lightsOnOff;
    }

    @Override
    public String getCarType(){
        return "Cabrio";
    }
}
