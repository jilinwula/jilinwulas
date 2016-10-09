package com.jilinwula.design.builder;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-27 16:15
 * @since 1.0.1
 */
public class PersionDirector {
    private PersionBuilder pb;

    public PersionDirector(PersionBuilder pb) {
        this.pb = pb;
    }

    public void createPersion() {
        pb.buildHead();
        pb.buildBody();
        pb.buildLeft();
        pb.buildRight();
    }
}
