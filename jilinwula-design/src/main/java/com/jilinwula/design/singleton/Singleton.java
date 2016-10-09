package com.jilinwula.design.singleton;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-29 15:09
 * @since 1.0.1
 */
public class Singleton {
    private static Singleton instance;
    private static final Object syncRoot = new Object();

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (syncRoot) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
