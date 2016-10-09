package com.jilinwula.design.publish;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-27 17:15
 * @since 1.0.1
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifys() {
        for(Observer o: observers) {
            o.update();
        }
    }
}
