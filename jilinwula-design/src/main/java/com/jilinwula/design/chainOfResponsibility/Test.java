package com.jilinwula.design.chainOfResponsibility;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-29 17:46
 * @since 1.0.1
 */
public class Test {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandlerA();
        Handler h2 = new ConcreteHandlerB();
        Handler h3 = new ConcreteHandlerC();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        int[] requests = {2, 5, 22, 18, 3, 27, 20};

        for (int request : requests) {
            h1.handlerRequest(request);
        }

    }
}
