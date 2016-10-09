package com.jilinwula.design.iterator;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-29 14:50
 * @since 1.0.1
 */
public class ConcreteIterator extends Iterator {

    private ConcreteAggregate aggregate;
    private int current = 0;
    @Override
    public Object first() {
        return null;
    }

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public boolean isDone() {
        return false;
    }

    @Override
    public Object currentItem() {
        return null;
    }
}
