package com.jilinwula.design.interpreter;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-10-13 13:57
 * @since 1.0.1
 */
public class TerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }
}
