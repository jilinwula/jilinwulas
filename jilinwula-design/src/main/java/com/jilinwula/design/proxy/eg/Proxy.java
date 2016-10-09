package com.jilinwula.design.proxy.eg;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-26 18:46
 * @since 1.0.1
 */
public class Proxy implements GiveGift {
    private PurSuit purSuit;

    public Proxy(SchoolGirl schoolGirl) {
        purSuit = new PurSuit(schoolGirl);
    }

    @Override
    public void giveDolls() {
        purSuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        purSuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        purSuit.giveChocolate();
    }
}
