package com.jilinwula.aop.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 标识为一个切面
 * @author jilinwula@foxmail.com
 * @datetime 16/9/17 下午5:13
 */
@Aspect
public class PreGreetingAspect {
    @Before("execution(* greetTo(..))")
    public void beforeGreeting() {
        System.out.println("How are you");
    }
}
