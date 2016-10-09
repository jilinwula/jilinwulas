package com.jilinwula.design.proxy.eg;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-26 18:43
 * @since 1.0.1
 */
public class PurSuit implements GiveGift {
    private SchoolGirl schoolGirl;

    public PurSuit(SchoolGirl schoolGirl) {
        this.schoolGirl = schoolGirl;
    }

    @Override
    public void giveDolls() {
        System.out.println(String.format("%s 送你的娃娃", schoolGirl.getName()));
    }

    @Override
    public void giveFlowers() {
        System.out.println(String.format("%s 送你的鲜花", schoolGirl.getName()));
    }

    @Override
    public void giveChocolate() {
        System.out.println(String.format("%s 送你的巧克力", schoolGirl.getName()));
    }
}
