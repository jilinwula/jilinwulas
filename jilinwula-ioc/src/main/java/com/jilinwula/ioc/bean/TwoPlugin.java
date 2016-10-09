package com.jilinwula.ioc.bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author jilinwula@foxmail.com
 * @datetime 16/9/15 下午2:55
 */
public class TwoPlugin implements Plugin {
    public void test() {
        System.out.println("towPlugin");
    }
}
