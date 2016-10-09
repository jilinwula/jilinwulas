package com.jilinwula.design.mediator;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-29 18:12
 * @since 1.0.1
 */
public abstract class Mediator {
    public abstract void send(String message, Colleague colleague);
}
