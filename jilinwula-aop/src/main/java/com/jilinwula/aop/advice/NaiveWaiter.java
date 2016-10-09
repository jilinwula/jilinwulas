package com.jilinwula.aop.advice;

/**
 * @author jilinwula@foxmail.com
 * @datetime 16/9/15 下午4:17
 */
public class NaiveWaiter implements Waiter {
    public void greetTo(String name) {
        System.out.println(String.format("greet to %s ...", name));
    }

    public void serveTo(String name) {
        System.out.println(String.format("serving %s ...", name));
    }
}
