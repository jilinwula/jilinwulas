package com.jilinwula.design.memento;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-29 10:47
 * @since 1.0.1
 */
public class Test {
    public static void main(String[] args) {
        Originator o = new Originator();
        o.setState("On");
        o.show();

        Caretaker c = new Caretaker();
        c.setMemento(o.createMemento());

        o.setState("Off");
        o.show();

        o.setMemento(c.getMemento());
        o.show();
    }
}
