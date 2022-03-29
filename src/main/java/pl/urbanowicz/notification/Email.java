package pl.urbanowicz.notification;

import pl.urbanowicz.order.Order;

public class Email implements Observer {
    @Override
    public void update(Order order) {
        System.out.println("E-mail - order number: " + order.getOrderNumber() + " have changed status: " + order.getOrderStatus());
    }
}
