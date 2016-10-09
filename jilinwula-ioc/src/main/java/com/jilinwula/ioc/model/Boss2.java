package com.jilinwula.ioc.model;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-20 16:47
 * @since 1.0.1
 */
public class Boss2 implements MethodReplacer {
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        Car car = new Car();
        car.setBrand("奔驰");
        return car;
    }
}
