package com.jilinwula.aop.advice;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * @author jilinwula@foxmail.com
 * @datetime 16/9/15 下午5:27
 */
public class TransactionManager implements ThrowsAdvice {
    public  void afterThrowing(Method method, Object [] args, Object target, Exception ex) throws Throwable {
        System.out.println(String.format("method:%s", method.getName()));
        System.out.println(String.format("抛出异常:%s", ex.getMessage()));
        System.out.println("成功回滚事务.");
    }
    public  void afterThrowing(Exception ex) throws Throwable {

    }
}
