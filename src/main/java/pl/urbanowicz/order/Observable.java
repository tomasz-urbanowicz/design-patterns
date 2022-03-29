package pl.urbanowicz.order;

import pl.urbanowicz.notification.Observer;

public interface Observable {

    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();

}
