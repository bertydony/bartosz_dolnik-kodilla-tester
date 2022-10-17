package com.kodilla.mockito.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherService {

    private Map<Location, List<Person>> allTheLocations = new HashMap<>();

    public void addLocation(Location location) {
        allTheLocations.put(location, new ArrayList<Person>());
    }

    public void removeLocation(Location location) {
        for (Map.Entry<Location, List<Person>> entry : allTheLocations.entrySet()) {
            if (entry.getKey().equals(location)) {
                for(Person person : entry.getValue()) {
                    entry.getKey().removeSubscriber(person);
                }
            }
        }
        allTheLocations.remove(location);
    }

    public void addSubscriber(Person person, Location location) {
        if (!allTheLocations.containsKey(location)) {

            this.addLocation(location);
        }
        for (Map.Entry<Location, List<Person>> entry : allTheLocations.entrySet()) {
            if (entry.getKey().equals(location)) {
                entry.getValue().add(person);
                entry.getKey().receiveSubscriber(person);
            }
        }
    }

    public void removeSubscriberFromLocation(Person person, Location location) {
        for (Map.Entry<Location, List<Person>> entry : allTheLocations.entrySet()) {
            if(entry.getKey().equals(location) && entry.getValue().contains(person)) {
                entry.getValue().remove(person);
                entry.getKey().removeSubscriber(person);
            }
        }
    }

    public void removeSubscriberFromAllLocations(Person person) {
        for (Map.Entry<Location, List<Person>> entry : allTheLocations.entrySet()) {
            if(entry.getValue().contains(person)) {
                entry.getValue().remove(person);
                entry.getKey().removeSubscriber(person);
            }
        }
    }

    public void sendNotificationToLocation(WeatherNotification weatherNotification, Location location) {
        for (Map.Entry<Location, List<Person>> entry : this.allTheLocations.entrySet()) {
            if(entry.getKey().equals(location)) {
                entry.getValue().forEach(person -> person.receive(weatherNotification));
            }
        }
    }

    public void sendNotificationToAll(WeatherNotification weatherNotification) {
        for (Map.Entry<Location, List<Person>> entry : this.allTheLocations.entrySet()) {
            entry.getValue().forEach(person -> person.receive(weatherNotification));
        }
    }
}
