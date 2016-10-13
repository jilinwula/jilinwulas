package com.jilinwula.design.visitor;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-10-13 14:39
 * @since 1.0.1
 */
public class Test {
    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();
        o.attach(new ConcreateElementA());
        o.attach(new ConcreateElementB());

        ConcreateVistor1 v1 = new ConcreateVistor1();
        ConcreateVistor2 v2 = new ConcreateVistor2();

        o.accept(v1);
        o.accept(v2);
    }
}
