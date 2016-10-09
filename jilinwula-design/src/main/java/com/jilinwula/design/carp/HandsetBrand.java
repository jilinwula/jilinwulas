package com.jilinwula.design.carp;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-29 16:15
 * @since 1.0.1
 */
public abstract class HandsetBrand {
    protected HandsetSoft soft;

    public HandsetBrand(HandsetSoft soft) {
        this.soft = soft;
    }

    public HandsetBrand() {
    }

    public HandsetSoft getSoft() {
        return soft;
    }

    public void setSoft(HandsetSoft soft) {
        this.soft = soft;
    }

    public abstract void run();
}
