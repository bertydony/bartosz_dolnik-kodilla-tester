package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure){
       List<Flight> departures = FlightRepository.getFlightTable();
       List<Flight> result = new ArrayList<>();
       for(int i = 0; i < departures.size(); i++){
           Flight flight = departures.get(i);
           if(flight.getDeparture().equals(departure)){
               result.add(flight);
           }
       }
       return result;
    }
    public List<Flight> findFlightsTo(String arrival){
        List<Flight> arrivals = FlightRepository.getFlightTable();
        List<Flight> result = new ArrayList<>();
        for(int i = 0; i < arrivals.size(); i++){
            Flight flight = arrivals.get(i);
            if(flight.getDeparture().equals(arrival)){
                result.add(flight);
            }
        }
        return result;
    }
}
