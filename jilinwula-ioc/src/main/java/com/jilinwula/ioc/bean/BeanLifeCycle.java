package com.jilinwula.ioc.bean;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-20 14:20
 * @since 1.0.1
 */
public class BeanLifeCycle {
    @Test
    public void test() {

        // 装载配置文件并启动容器
        Resource res = new ClassPathResource("applicationContext-ioc.xml");
        BeanFactory bf = new XmlBeanFactory(res);

        // 向容器中注册MyBeanPostProcessor处理器
        ((ConfigurableBeanFactory) bf).addBeanPostProcessor(new MyBeanPostProcessor());

        // 向容器中注册MyInstantiationAwareBeanPostProcessor处理器
        ((ConfigurableBeanFactory) bf).addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessor());

        Car car1 = bf.getBean("car", Car.class);
        car1.introduce();
        car1.setColor("红色");

        Car car2 = bf.getBean("car", Car.class);
        System.out.println("car1==car2:" + (car1 == car2));

        // 关闭容器
        ((XmlBeanFactory)bf).destroySingletons();
    }
}
