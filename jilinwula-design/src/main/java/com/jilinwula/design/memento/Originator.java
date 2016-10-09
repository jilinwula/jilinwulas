package com.jilinwula.design.memento;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-29 10:38
 * @since 1.0.1
 */
public class Originator {
    private String state;

    public Memento createMemento() {
        return new Memento(state);
    }

    public void setMemento(Memento memento) {
        state = memento.getState();
    }

    public void show() {
        System.out.println(String.format("State=%s", state));
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
