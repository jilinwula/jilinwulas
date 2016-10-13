package com.jilinwula.design.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-10-13 13:59
 * @since 1.0.1
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> list = new ArrayList<AbstractExpression>();
        list.add(new TerminalExpression());
        list.add(new NonTerminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());
        for (AbstractExpression exp : list) {
            exp.interpret(context);
        }
    }
}
