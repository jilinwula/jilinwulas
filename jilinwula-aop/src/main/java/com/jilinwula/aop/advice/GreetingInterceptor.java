package com.jilinwula.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author jilinwula@foxmail.com
 * @datetime 16/9/15 下午5:14
 */
public class GreetingInterceptor implements MethodInterceptor {
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object [] args = invocation.getArguments(); // 目标方法入参
        String clientName = (String) args[0];
        System.out.println(String.format("How are you ! Mr. %s .", clientName));
        Object obj = invocation.proceed(); // 通过反射机制调用目标方法
        System.out.println("Please enjoy yourself !");
        return obj;
    }
}
