package com.jilinwula.ioc.bean;

import com.jilinwula.ioc.model.Car;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jilinwula@foxmail.com
 * @datetime 16/9/14 下午10:05
 */
public class AnnotationConfigApplicationContextTest {
    @Test
    public void test1() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeansTest.class);
        Car car = ctx.getBean("car", Car.class);
        System.out.println(car);
    }
}
