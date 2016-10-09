package com.jilinwula.aop.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author jilinwula@foxmail.com
 * @datetime 16/9/15 下午4:19
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        String clientName = (String) objects[0];
        System.out.println(String.format("How are you ! Mr . %s .", clientName));
    }
}
