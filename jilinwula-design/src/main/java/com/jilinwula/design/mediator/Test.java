package com.jilinwula.design.mediator;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-29 18:21
 * @since 1.0.1
 */
public class Test {
    public static void main(String[] args) {
        ConcreteMediator m = new ConcreteMediator();

        ConcreteColleagueA c1 = new ConcreteColleagueA(m);
        ConcreteColleagueB c2 = new ConcreteColleagueB(m);

        m.setColleagueA(c1);
        m.setColleagueB(c2);

        c1.send("吃过饭了吗");
        c2.send("没有呢，你打算请客");
    }
}
