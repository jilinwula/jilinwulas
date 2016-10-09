package com.jilinwula.aop.aspectj;

import com.jilinwula.aop.advice.NaiveWaiter;
import com.jilinwula.aop.advice.Waiter;
import org.junit.Test;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**
 * @author jilinwula@foxmail.com
 * @datetime 16/9/17 下午5:18
 */
public class AspectJProxyTest {
    @Test
    public void test1() throws Exception {
        Waiter target = new NaiveWaiter();
        AspectJProxyFactory factory = new AspectJProxyFactory();
        // 设置目标对象
        factory.setTarget(target);

        // 添加切面类
        factory.addAspect(PreGreetingAspect.class);

        // 生成植入切面的代理对象
        Waiter proxy = factory.getProxy();
        proxy.greetTo("John");
        proxy.serveTo("John");
    }
}
