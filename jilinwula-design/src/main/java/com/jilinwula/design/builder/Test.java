package com.jilinwula.design.builder;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-27 16:17
 * @since 1.0.1
 */
public class Test {
    public static void main(String[] args) {
        PersionThinBuilder ptb = new PersionThinBuilder(1, 1, 1, 1);
        PersionDirector pdThin = new PersionDirector(ptb);
        pdThin.createPersion();
    }
}
