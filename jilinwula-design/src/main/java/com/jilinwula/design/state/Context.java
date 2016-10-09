package com.jilinwula.design.state;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-28 11:53
 * @since 1.0.1
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        System.out.println("当前状态：");
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }
}
