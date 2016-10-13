package com.jilinwula.design.visitor;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-10-13 14:24
 * @since 1.0.1
 */
public class ConcreateElementB extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }
    public void operationB() {

    }
}
