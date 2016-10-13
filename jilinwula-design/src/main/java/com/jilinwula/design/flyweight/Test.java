package com.jilinwula.design.flyweight;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-10-13 13:39
 * @since 1.0.1
 */
public class Test {
    public static void main(String[] args) {
        int i = 22;
        FlyweightFactory f = new FlyweightFactory();

        Flyweight fx = f.getFlyweight("x");
        fx.operation(--i);

        Flyweight fy = f.getFlyweight("y");
        fy.operation(--i);

        Flyweight fz = f.getFlyweight("z");
        fz.operation(--i);

        UnShardConcreteFlyweight uf = new UnShardConcreteFlyweight();

        uf.operation(--i);
    }
}
