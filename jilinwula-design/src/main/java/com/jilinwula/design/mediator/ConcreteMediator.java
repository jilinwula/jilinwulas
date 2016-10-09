package com.jilinwula.design.mediator;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-29 18:14
 * @since 1.0.1
 */
public class ConcreteMediator extends Mediator {
    private ConcreteColleagueA colleagueA;
    private ConcreteColleagueB colleagueB;

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    public void setColleagueA(ConcreteColleagueA colleagueA) {

        this.colleagueA = colleagueA;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == colleagueA) {
            colleagueB.notify(message);
        } else {
            colleagueA.notify(message);
        }
    }
}
