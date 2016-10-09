package com.jilinwula.design.simplefactory;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-23 15:24
 * @since 1.0.1
 */
public class OperationAdd implements Operation {
    @Override
    public int getResult(int a, int b) {
        return a + b;
    }
}
