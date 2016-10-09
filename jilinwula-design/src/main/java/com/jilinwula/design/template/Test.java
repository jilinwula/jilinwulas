package com.jilinwula.design.template;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-27 14:27
 * @since 1.0.1
 */
public class Test {
    public static void main(String[] args) {
        AbstractClass c = new ConcreateClassA();
        c.templateMethod();
        c = new ConcreateClassB();
        c.templateMethod();
    }
}
