package com.jilinwula.design.publish;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-27 17:22
 * @since 1.0.1
 */
public class ConcreteObserver extends Observer {
    private String name;
    private String observerState;
    private ConcreteSubject subject;

    public void update() {
        observerState = subject.getSubjectState();
        System.out.println(String.format("观察者%s的新状态是：%s", name, observerState));
    }

    public ConcreteObserver(ConcreteSubject subject, String name) {
        this.subject = subject;
        this.name = name;
    }

    public ConcreteSubject getSubject() {
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }
}
