package com.jilinwula.aop.advice;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jilinwula@foxmail.com
 * @datetime 16/9/15 下午4:43
 */
public class StringAdviceTest {

    @Test
    public void test1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext-aop.xml");
        Waiter waiter = ctx.getBean("waiter", Waiter.class);
        waiter.greetTo("John");
    }

    @Test
    public void test2() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext-aop.xml");
        Waiter waiter = ctx.getBean("target", Waiter.class);
        waiter.greetTo("John");

    }

    @Test
    public void test3() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext-aop.xml");
        Waiter waiter = ctx.getBean("target", Waiter.class);
        waiter.greetTo("John");
        Seller seller = ctx.getBean("seller", Seller.class);
        seller.greetTO("John2");
        seller.greetT("John3");
    }

    @Test
    public void test4() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext-aop.xml");
        Waiter waiter = ctx.getBean("waiter", Waiter.class);
        waiter.serveTo("John");
    }
}
