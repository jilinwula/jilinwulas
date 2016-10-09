package com.jilinwula.ioc.bean;

import com.jilinwula.ioc.model.Boss;
import com.jilinwula.ioc.model.Boss1;
import com.jilinwula.ioc.model.Car;
import com.jilinwula.ioc.model.MagicBoss;
import com.jilinwula.ioc.plugin.*;
import com.jilinwula.ioc.plugin.MyComponent;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 *
 *
 *
 * @author jilinwula@foxmail.com
 * @datetime 16/9/14 下午9:07
 */
public class ApplicationContextTest {

    @Test
    public void test1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext-ioc.xml");
        Car car = ctx.getBean("car", Car.class);
        System.out.println(car);
    }

    @Test public void test2() {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:applicationContext-ioc.xml");
        Car car = ctx.getBean("car", Car.class);
        System.out.println(car);
    }

    @Test
    public void test3() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"applicationContext-ioc.xml"});
        Car car = ctx.getBean("car", Car.class);
        System.out.println(car);
    }

    @Test
    public void test4() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"applicationContext-ioc.xml"});
        Boss boss = ctx.getBean("boss", Boss.class);
        System.out.println(boss);
    }

    @Test
    public void test5() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"applicationContext-ioc.xml"});
        MyComponent component = ctx.getBean("myComponent", MyComponent.class);
        for (com.jilinwula.ioc.plugin.Plugin plugin : component.getPlugins()) {
            System.out.println(plugin.getPLuginName());
        }
    }

    @Test
    public void test6() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"applicationContext-ioc.xml"});
        MagicBoss magicBoss = ctx.getBean("magicBoss", MagicBoss.class);
        Car car = magicBoss.getCar();
        car.introduce();
    }

    @Test
    public void test7() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"applicationContext-ioc.xml"});
        Boss1 boss1 = ctx.getBean("boss1", Boss1.class);
        Car car = boss1.getCar();
        car.introduce();
    }

    @Test
    public void test8() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"applicationContext-ioc.xml"});
        Car car1 = ctx.getBean("car1", Car.class);
        Car car2 = ctx.getBean("car2", Car.class);
        car1.introduce();
        car2.introduce();
    }
}
