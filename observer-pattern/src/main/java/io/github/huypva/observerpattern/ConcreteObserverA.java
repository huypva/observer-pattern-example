package io.github.huypva.observerpattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author huypva
 */
@Slf4j
public class ConcreteObserverA implements Observer {
    @Override
    public void update() {
        log.info("ConcreteObserverA update");
    }
}
