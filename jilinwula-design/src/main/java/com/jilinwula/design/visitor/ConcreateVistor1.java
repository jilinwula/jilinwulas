package com.jilinwula.design.visitor;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-10-13 14:24
 * @since 1.0.1
 */
public class ConcreateVistor1 extends Visitor {
    @Override
    public void visitConcreteElementA(ConcreateElementA concreateElementA) {
        System.out.println(concreateElementA.getClass().getTypeName());
    }

    @Override
    public void visitConcreteElementB(ConcreateElementB concreateElementB) {
        System.out.println(concreateElementB.getClass().getTypeName());
    }
}
