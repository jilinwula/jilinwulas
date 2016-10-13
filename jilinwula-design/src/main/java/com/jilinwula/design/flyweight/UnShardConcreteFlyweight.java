package com.jilinwula.design.flyweight;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-10-13 13:34
 * @since 1.0.1
 */
public class UnShardConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println(String.format("不共享的具体Flyweight%d", extrinsicstate));
    }
}
