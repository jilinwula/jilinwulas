package com.jilinwula.design.builder.eg;


/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-27 16:44
 * @since 1.0.1
 */
public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        Builder b1 = new ConcreteBuilderA();
        Builder b2 = new ConcreteBuilderB();
        director.construct(b1);
        Product p1 = b1.getResult();
        p1.show();

        director.construct(b2);
        Product p2 = b2.getResult();
        p2.show();
    }
}
