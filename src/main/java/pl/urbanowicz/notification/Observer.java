package pl.urbanowicz.notification;

import pl.urbanowicz.order.Order;

public interface Observer {

    void update(Order order);
}
