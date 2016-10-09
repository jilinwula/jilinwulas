package com.jilinwula.ioc.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-20 14:53
 * @since 1.0.1
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    public void postProcessBeanFactory(ConfigurableListableBeanFactory bf) throws BeansException {
        BeanDefinition bd = bf.getBeanDefinition("car");
        bd.getPropertyValues().addPropertyValue("brand", "大众宝来");
        System.out.println("调用BeanFactoryPostProcessor接口中的postProcessBeanFactory()方法");
    }
}
