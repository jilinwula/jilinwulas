package com.jilinwula.design.iterator;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-29 14:48
 * @since 1.0.1
 */
public abstract class Iterator {
    public abstract Object first();

    public abstract Object next();

    public abstract boolean isDone();

    public abstract Object currentItem();
}
