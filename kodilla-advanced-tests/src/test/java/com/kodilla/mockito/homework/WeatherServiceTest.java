package com.kodilla.mockito.homework;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;

public class WeatherServiceTest {
    WeatherService weatherService = new WeatherService();
    Person person = Mockito.mock(Person.class);
    Location location = Mockito.mock(Location.class);
    WeatherNotification weatherNotification = Mockito.mock(WeatherNotification.class);

    @Test
    public void notSubscribedPersonShouldNotReceiveNotifications() {
        weatherService.addLocation(location);
        weatherService.sendNotificationToLocation(weatherNotification, location);
        Mockito.verify(person, Mockito.never()).receive(weatherNotification);
    }

    @Test
    public void shouldAddLocation() {
        Location locationTwo = Mockito.mock(Location.class);
        weatherService.addLocation(locationTwo);
        weatherService.addSubscriber(person, locationTwo);
        Mockito.verify(locationTwo, Mockito.times(1)).receiveSubscriber(person);
    }

    @Test
    public void shouldAddSubscriberToLocation() {
        weatherService.addLocation(location);
        weatherService.addSubscriber(person, location);
        Mockito.verify(location, Mockito.times(1)).receiveSubscriber(person);
    }

    @Test
    public void subscribedPersonShouldReceiveNotificationFromRightLocation() {
        weatherService.addSubscriber(person, location);
        weatherService.sendNotificationToLocation(weatherNotification, location);
        Mockito.verify(person, Mockito.times(1)).receive(weatherNotification);
    }

    @Test
    public void subscribedPersonShouldNotReceiveNotificationFromWrongLocation() {
        weatherService.addSubscriber(person, location);
        Location locationTwo = Mockito.mock(Location.class);
        weatherService.sendNotificationToLocation(weatherNotification, locationTwo);
        Mockito.verify(person, Mockito.never()).receive(weatherNotification);
    }

    @Test
    public void shouldUnsubscribePersonFromLocation() {
        weatherService.addSubscriber(person, location);
        weatherService.removeSubscriberFromLocation(person, location);
        Mockito.verify(location, Mockito.times(1)).removeSubscriber(person);
    }

    @Test
    public void personUnsubscribeFromLocationShouldNotReceiveNotificationsFromLocation() {
        weatherService.addSubscriber(person, location);
        weatherService.removeSubscriberFromLocation(person, location);
        weatherService.sendNotificationToLocation(weatherNotification,location);
        Mockito.verify(person, Mockito.never()).receive(weatherNotification);
    }

    @Test
    public void shouldUnsubscribePersonFromAll() {
        Location locationTwo = Mockito.mock(Location.class);
        weatherService.addSubscriber(person, location);
        weatherService.addSubscriber(person, locationTwo);
        weatherService.removeSubscriberFromAllLocations(person);
        Mockito.verify(location, Mockito.times(1)).removeSubscriber(person);
        Mockito.verify(locationTwo, Mockito.times(1)).removeSubscriber(person);
    }

    @Test
    public void personUnsubscribedFromAnyLocationShouldNotReceiveNotificationsToAll() {
        weatherService.addSubscriber(person, location);
        weatherService.removeSubscriberFromLocation(person, location);
        weatherService.sendNotificationToAll(weatherNotification);
        Mockito.verify(person, Mockito.never()).receive(weatherNotification);
    }

    @Test
    public void personUnsubscribedFromAllShouldNotReceiveNotificationsToAll() {
        Location locationTwo = Mockito.mock(Location.class);
        weatherService.addSubscriber(person, location);
        weatherService.addSubscriber(person, locationTwo);
        weatherService.removeSubscriberFromAllLocations(person);
        weatherService.sendNotificationToAll(weatherNotification);
        Mockito.verify(person, Mockito.never()).receive(weatherNotification);
    }


    @Test
    public void shouldNotSendNotificationsToAllIfAllUnsubscribed() {
        Person personTwo = Mockito.mock(Person.class);
        Location locationTwo = Mockito.mock(Location.class);
        Person personThree = Mockito.mock(Person.class);
        Location locationThree = Mockito.mock(Location.class);

        weatherService.addSubscriber(personTwo, locationTwo);
        weatherService.addSubscriber(person, location);
        weatherService.addSubscriber(personThree, locationThree);

        weatherService.removeSubscriberFromLocation(person, location);
        weatherService.removeSubscriberFromLocation(personTwo, locationTwo);
        weatherService.removeSubscriberFromLocation(personThree, locationThree);

        weatherService.sendNotificationToAll(weatherNotification);

        Mockito.verify(personTwo, Mockito.never()).receive(weatherNotification);
        Mockito.verify(person, Mockito.never()).receive(weatherNotification);
        Mockito.verify(personThree, Mockito.never()).receive(weatherNotification);
    }

    @Test
    public void allShouldBeUnsubscribeFromRemovedLocation() {
        Person personTwo = Mockito.mock(Person.class);
        weatherService.addSubscriber(person,location);
        weatherService.addSubscriber(personTwo,location);
        weatherService.removeLocation(location);
        Mockito.verify(location, Mockito.times(1)).removeSubscriber(person);
        Mockito.verify(location, Mockito.times(1)).removeSubscriber(personTwo);
    }

    @Test
    public void personShouldNotReceiveNotificationsFromRemovedLocation() {
        weatherService.addSubscriber(person,location);
        weatherService.removeLocation(location);
        weatherService.sendNotificationToLocation(weatherNotification,location);
        Mockito.verify(person, Mockito.never()).receive(weatherNotification);
    }
}