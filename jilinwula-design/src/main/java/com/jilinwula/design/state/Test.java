package com.jilinwula.design.state;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-28 11:56
 * @since 1.0.1
 */
public class Test {
    public static void main(String[] args) {
        Context c = new Context(new ConcreteStateA());
        c.request();
        c.request();
        c.request();
        c.request();
    }
}
