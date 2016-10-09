package com.jilinwula.design.builder;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-27 16:06
 * @since 1.0.1
 */
public abstract class PersionBuilder {
    protected int x;
    protected int y;
    protected int a;
    protected int b;

    public PersionBuilder(int x, int y, int a, int b) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
    }

    public abstract void buildHead();
    public abstract void buildBody();
    public abstract void buildLeft();
    public abstract void buildRight();
}
