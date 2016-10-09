package com.jilinwula.design.decorator;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-26 16:21
 * @since 1.0.1
 */
public class ConcreteComponentA extends Decorator {
    @Override
    public void operation() {
        super.operation();
        System.out.println("大衣");
    }
}
