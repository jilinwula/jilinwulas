package com.jilinwula.design.decorator;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-26 16:29
 * @since 1.0.1
 */
public class Test {
    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteComponentA d1 = new ConcreteComponentA();
        ConcreteComponentB d2 = new ConcreteComponentB();
        d1.setComponent(c);
        d2.setComponent(d1);
        d2.operation();
    }
}
