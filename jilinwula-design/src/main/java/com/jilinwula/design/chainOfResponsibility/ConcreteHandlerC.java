package com.jilinwula.design.chainOfResponsibility;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-29 17:38
 * @since 1.0.1
 */
public class ConcreteHandlerC extends Handler {

    @Override
    public void handlerRequest(int requset) {
        if (requset >= 20 && requset < 30) {
            System.out.println(String.format("处理请求%d", requset));
        } else if (successor != null) {
            successor.handlerRequest(requset);
        }
    }
}
