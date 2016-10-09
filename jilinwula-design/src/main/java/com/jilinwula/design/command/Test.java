package com.jilinwula.design.command;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-29 17:09
 * @since 1.0.1
 */
public class Test {
    public static void main(String[] args) {
        Receiver r = new Receiver();
        Command c = new ConcreteCommand(r);
        Invoker i = new Invoker();
        i.setCommand(c);
        i.executeCommand();
    }
}
