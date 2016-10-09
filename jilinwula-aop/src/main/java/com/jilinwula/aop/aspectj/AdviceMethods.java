package com.jilinwula.aop.aspectj;

import org.apache.commons.lang.IllegalClassException;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author jilinwula@foxmail.com
 * @datetime 16/9/17 下午6:05
 */
public class AdviceMethods {

    public void preGreeting() {
        System.out.println("-- how are you --");
    }

    public void afterRetruning(int retVal) {

    }

    public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("111111111111111111111111");
        pjp.proceed();
        System.out.println("222222222222222222222222");
    }

    public void afterThrowingMethod(IllegalClassException iae) {
        iae.getMessage();
    }

}
