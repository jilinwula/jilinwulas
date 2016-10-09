package com.jilinwula.design.template;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-27 14:24
 * @since 1.0.1
 */
public abstract class AbstractClass {
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();
    public void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
    }
}
