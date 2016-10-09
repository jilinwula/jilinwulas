package com.jilinwula.design.carp;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-29 16:16
 * @since 1.0.1
 */
public class HandsetBrandN extends HandsetBrand {
    public HandsetBrandN(HandsetSoft soft) {
        super(soft);
    }

    public HandsetBrandN() {
    }

    @Override
    public void run() {
        soft.run();
    }
}
