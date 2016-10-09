package com.jilinwula.design.carp;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-29 16:24
 * @since 1.0.1
 */
public class Test {
    public static void main(String[] args) {
        HandsetBrand ab = new HandsetBrandN();

        ab.setSoft(new HandsetGame());
        ab.run();

        ab.setSoft(new HandsetAddressList());
        ab.run();

        ab = new HandsetBrandM();

        ab.setSoft(new HandsetGame());
        ab.run();

        ab.setSoft(new HandsetAddressList());
        ab.run();

    }
}
