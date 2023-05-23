package io.github.huypva.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huypva
 */
public class Subject {
    public List<Observer> observerList;

    public Subject() {
        observerList = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers() {
        observerList.stream().forEach(observer -> observer.update());
    }
}
