package com.jilinwula.ioc.model;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-20 16:37
 * @since 1.0.1
 */
public class MagicBossImpl implements MagicBoss, ApplicationContextAware {
    private ApplicationContext ctx;
    public Car getCar() {
        return ctx.getBean("car", Car.class);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }
}
