package io.github.huypva.observerpattern;

/**
 * @author huypva
 */
public class Main {

  public static void main(String[] args) {
    Subject subject = new Subject();
    subject.registerObserver(new ConcreteObserverA());
    subject.registerObserver(new ConcreteObserverB());

    subject.notifyObservers();
  }
}
