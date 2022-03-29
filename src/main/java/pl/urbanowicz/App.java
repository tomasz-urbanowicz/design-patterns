package pl.urbanowicz;

import pl.urbanowicz.notification.Email;
import pl.urbanowicz.notification.MobileApp;
import pl.urbanowicz.notification.TextMessage;
import pl.urbanowicz.order.Order;
import pl.urbanowicz.order.OrderStatus;

public class App {
    public static void main(String[] args) {
        Order order = new Order(110L, OrderStatus.REGISTERED);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);

        order.notifyObservers();

        System.out.println("------------------------------");

        order.changeOrderStatus(OrderStatus.SENT);

        order.unregisterObserver(email);

        System.out.println("------------------------------");

        order.changeOrderStatus(OrderStatus.RECEIVED);

    }
}
