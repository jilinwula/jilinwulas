package com.jilinwula.design.memento;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-29 10:47
 * @since 1.0.1
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {

        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
