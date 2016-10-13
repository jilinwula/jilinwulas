package com.jilinwula.design.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-10-13 13:36
 * @since 1.0.1
 */
public class FlyweightFactory {
    private Map<String, Flyweight> flyweights = new HashMap<String, Flyweight>();

    public FlyweightFactory() {
        flyweights.put("x", new ConcreteFlyweight());
        flyweights.put("y", new ConcreteFlyweight());
        flyweights.put("z", new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key) {
        return flyweights.get(key);
    }
}
