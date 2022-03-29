package pl.urbanowicz.notification;

import pl.urbanowicz.order.Order;

public class TextMessage implements Observer {
    @Override
    public void update(Order order) {
        System.out.println("SMS - order number: " + order.getOrderNumber() + " have changed status: " + order.getOrderStatus());
    }
}
