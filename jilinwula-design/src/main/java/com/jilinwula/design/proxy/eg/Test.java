package com.jilinwula.design.proxy.eg;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-26 18:50
 * @since 1.0.1
 */
public class Test {
    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl();
        schoolGirl.setName("小美");

        Proxy proxy = new Proxy(schoolGirl);

        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}
