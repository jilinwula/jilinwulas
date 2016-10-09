package com.jilinwula.ioc.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-20 14:12
 * @since 1.0.1
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        if ("car".equals(s)) {
            Car car = (Car) o;
            if (car.getColor() == null) {
                System.out.println("调用BeanPostProcessor接口postProcessBeforeInitialization");
                car.setColor("黑色");
            }
        }
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        if ("car".equals(s)) {
            Car car = (Car) o;
            if (car.getMaxSpeed() >= 200) {
                System.out.println("调用BeanPostProcessor接口postProcessAfterInitialization");
                car.setMaxSpeed(200);
            }
        }
        return o;
    }
}
