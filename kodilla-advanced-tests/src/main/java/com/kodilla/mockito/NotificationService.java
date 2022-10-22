package com.kodilla.mockito;

import com.kodilla.mockito.notification.Client;
import com.kodilla.mockito.notification.Notification;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NotificationService {

    private Set<Client> clients = new HashSet<>();

        public void addSubscriber(Client client) {
            this.clients.add(client);
        }

        public void sendNotification(Notification notification) {
            this.clients.forEach(client -> client.receive(notification));
        }

        public void removeSubscriber(Client client){
            this.clients.remove(client);
        }
    }

