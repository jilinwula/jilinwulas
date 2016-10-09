package com.jilinwula.design.facade;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-27 15:35
 * @since 1.0.1
 */
public class Facade {
    SubSystemOne one;
    SubSystemTwo two;

    public Facade() {
        one = new SubSystemOne();
        two = new SubSystemTwo();
    }

    public void methodA() {
        one.methodOne();
    }

    public void methodB() {
        two.methodTwo();
    }
}
