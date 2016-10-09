package com.jilinwula.design.proxy;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-26 18:31
 * @since 1.0.1
 */
public class Proxy extends Subject {
    private RealSubject realSubject;
    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
