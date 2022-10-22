package com.kodilla.mockito;

import com.kodilla.mockito.notification.Client;
import com.kodilla.mockito.notification.Notification;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class NotificationServiceTest {

    NotificationService notificationService = new NotificationService();
    Client client = Mockito.mock(Client.class);
    Client secondClient = Mockito.mock(Client.class);
    Client thirdClient = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);

    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {
        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void subscribedClientShouldReceiveNotification() {
    notificationService.addSubscriber(client);
    notificationService.sendNotification(notification);
    Mockito.verify(client, Mockito.times(1)).receive(notification);

    }

    @Test
    public void notificationShouldBeSentToAllSubscribedClients() {
        addSubscribers(client, secondClient, thirdClient);

        notificationService.sendNotification(notification);

        Mockito.verify(client).receive(notification);
        Mockito.verify(secondClient).receive(notification);
        Mockito.verify(thirdClient).receive(notification);
    }


    @Test
    public void shouldSendOnlyOneNotificationToMultiTimeSubscriber() {
        addSubscribers(client, client, client);

        notificationService.sendNotification(notification);

        Mockito.verify(client).receive(notification);
    }

    @Test
    public void unsubscribedClientShouldNotReceiveNotification() {
        notificationService.addSubscriber(client);
        notificationService.removeSubscriber(client);

        notificationService.sendNotification(notification);

        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    private void addSubscribers(Client... clients) {
        for(Client currentClient : clients) {
            notificationService.addSubscriber(currentClient);
        }
    }

}
