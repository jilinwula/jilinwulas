package com.jilinwula.design.state;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-28 11:54
 * @since 1.0.1
 */
public class ConcreteStateA extends State {
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}
