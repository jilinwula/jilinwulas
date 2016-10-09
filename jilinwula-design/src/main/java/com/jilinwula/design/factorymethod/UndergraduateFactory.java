package com.jilinwula.design.factorymethod;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-27 10:51
 * @since 1.0.1
 */
public class UndergraduateFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}
