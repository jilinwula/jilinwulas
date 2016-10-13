package com.jilinwula.design.visitor;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-10-13 14:25
 * @since 1.0.1
 */
public abstract class Element {
    public abstract void accept(Visitor visitor);
}
