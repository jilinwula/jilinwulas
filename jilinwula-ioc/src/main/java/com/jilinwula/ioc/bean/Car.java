package com.jilinwula.ioc.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-20 13:50
 * @since 1.0.1
 */
public class Car implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {
    private String brand;
    private String color;
    private int maxSpeed;
    private BeanFactory beanFactory;
    private String beanName;

    public void myInit() {
        System.out.println("调用init-method指定的myInit()");
        this.maxSpeed = 240;
    }

    public void myDestroy() {
        System.out.println("调用destroy-method指定的myDestroy()");
        this.maxSpeed = 240;
    }

    public Car() {
        System.out.println("调用car的构造函数");
    }

    public void introduce() {
        System.out.println(String.format("brand:%s;color:%s;maxSpeed:%d",brand, color, maxSpeed));
    }

    // BeanFactoryAware接口方法
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("调用BeanFactoryAware中的setBeanFactory()方法");
        this.beanFactory = beanFactory;
    }

    // BeanNameAware接口方法
    public void setBeanName(String s) {
        System.out.println("调用BeanNameAware中的setBeanName()方法");
        this.beanName = s;

    }

    // DisposableBean接口方法
    public void destroy() throws Exception {
        System.out.println("调用DisposableBean中的destroy方法");
    }

    public void afterPropertiesSet() throws Exception {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        System.out.println("调用setBrand()设置属性");
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public String getBeanName() {
        return beanName;
    }
}
