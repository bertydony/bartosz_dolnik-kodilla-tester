package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    private static List<Flight> flights = new ArrayList<>(){
        {
            add(new Flight("Wieden", "Berlin"));
            add(new Flight("Warszawa", "Dubaj"));
            add(new Flight("Krakow", "Cypr"));
            add(new Flight("Katowice", "Londyn"));
        }
    };

    public static List<Flight> getFlightTable(){
        return flights;
    }
}
