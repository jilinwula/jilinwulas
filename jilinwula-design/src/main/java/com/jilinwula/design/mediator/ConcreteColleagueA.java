package com.jilinwula.design.mediator;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-29 18:15
 * @since 1.0.1
 */
public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notify(String message) {
        System.out.println(String.format("得到A的信息：%s", message));
    }
}
