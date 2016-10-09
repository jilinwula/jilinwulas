package com.jilinwula.aop.advice;

/**
 * @author jilinwula@foxmail.com
 * @datetime 16/9/15 下午4:17
 */
public class Seller {
    public void greetT(String name) {
        System.out.println(String.format("greet t %s ...", name));
    }
    public void greetTO(String name) {
        System.out.println(String.format("greet to %s ...", name));
    }
}
