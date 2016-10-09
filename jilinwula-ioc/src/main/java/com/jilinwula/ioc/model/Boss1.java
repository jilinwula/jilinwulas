package com.jilinwula.ioc.model;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-20 16:46
 * @since 1.0.1
 */
public class Boss1 {
    private Car car;
    public Car getCar() {
        car = new Car();
        car.setBrand("宝马");
        return car;
    }
}
