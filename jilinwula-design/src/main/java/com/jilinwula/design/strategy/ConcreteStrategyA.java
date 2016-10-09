package com.jilinwula.design.strategy;

/**
 *
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-23 17:33
 * @since 1.0.1
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void algorithInterface() {
        System.out.println("ConcreteStrategyA");
    }
}
