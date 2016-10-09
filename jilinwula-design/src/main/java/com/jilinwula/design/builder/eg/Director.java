package com.jilinwula.design.builder.eg;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-27 16:43
 * @since 1.0.1
 */
public class Director {
    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
