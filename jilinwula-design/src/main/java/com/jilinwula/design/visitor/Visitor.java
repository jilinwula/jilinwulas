package com.jilinwula.design.visitor;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-10-13 14:22
 * @since 1.0.1
 */
public abstract class Visitor {
    public abstract void visitConcreteElementA(ConcreateElementA concreateElementA);
    public abstract void visitConcreteElementB(ConcreateElementB concreateElementA);
}
