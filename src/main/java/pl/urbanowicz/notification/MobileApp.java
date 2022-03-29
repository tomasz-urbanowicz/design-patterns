package pl.urbanowicz.notification;

import pl.urbanowicz.order.Order;

public class MobileApp implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("Mobile app - order number: " + order.getOrderNumber() + " have changed status to: " + order.getOrderStatus());
    }
}
