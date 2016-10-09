package com.jilinwula.design.factorymethod;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-27 10:53
 * @since 1.0.1
 */
public class Test {
    public static void main(String[] args) {
        IFactory factory = new UndergraduateFactory();
        LeiFeng leiFeng = factory.createLeiFeng();
        leiFeng.sweep();
        leiFeng.wash();
    }
}
