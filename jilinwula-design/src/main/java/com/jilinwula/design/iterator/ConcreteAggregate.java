package com.jilinwula.design.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-29 14:52
 * @since 1.0.1
 */
public class ConcreteAggregate extends Aggregate {
    private List<Object> item = new ArrayList<Object>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int count() {
        return item.size();
    }
}
