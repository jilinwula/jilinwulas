package com.jilinwula.ioc.bean;

import com.jilinwula.ioc.model.Car;
import com.sun.media.sound.SoftTuning;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * BeanFactory启动IoC容器时,不全初始化配置文件中的bean 当第一次调用时初始化bean 对于单例(singleton)的Bean来说
 * BeanFactory会缓存bean实例 第二次调用时 直接从缓存中获取bean
 * DefaultSingletonBeanRegistry类中提供了用于缓存单例的bean缓存器 它是用HashMap实现的
 * BeabFactory初始化时必须提供一种日志框架
 *
 * @author jilinwula@foxmail.com
 * @datetime 16/9/14 下午8:54
 */
public class BeanFactoryTest {
    @Test
    public void test1() {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource res = resolver.getResource("classpath:applicationContext-ioc.xml");
        BeanFactory bf = new XmlBeanFactory(res);
        System.out.println("init beanFactory.");
        Car car = bf.getBean("car", Car.class);
        System.out.println("car bean is ready for use!");
    }
}
