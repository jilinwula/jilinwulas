package com.jilinwula.aop.advice;

import org.junit.Before;
import org.junit.Test;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @author jilinwula@foxmail.com
 * @datetime 16/9/15 下午4:23
 */
public class BeforeAdviceTest {
    private Waiter target;
    private BeforeAdvice advice;
    private ProxyFactory pf;
    @Before
    public void init() {
        target = new NaiveWaiter();
        advice = new GreetingBeforeAdvice();
        pf = new ProxyFactory();
        pf.setTarget(target);
        pf.addAdvice(advice);
    }
    @Test
    public void beforeAdvice() {
        Waiter proxy = (Waiter) pf.getProxy();
        proxy.greetTo("John");
        proxy.serveTo("Tom");
    }
}
