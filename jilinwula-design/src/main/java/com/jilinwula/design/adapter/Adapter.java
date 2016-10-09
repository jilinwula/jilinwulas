package com.jilinwula.design.adapter;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-28 17:04
 * @since 1.0.1
 */
public class Adapter extends Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specificResquest();
    }
}
