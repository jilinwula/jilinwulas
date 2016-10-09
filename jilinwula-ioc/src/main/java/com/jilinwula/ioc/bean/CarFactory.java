package com.jilinwula.ioc.bean;

import com.jilinwula.ioc.model.Car;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-20 15:24
 * @since 1.0.1
 */
public class CarFactory {
    public Car createBaolaiCar() {
        Car car = new Car();
        car.setBrand("大众宝来");
        car.setColor("白色");
        return car;
    }

    public static Car createBaomaCar() {
        Car car = new Car();
        car.setBrand("德国宝马");
        car.setColor("白色");
        return car;
    }
}
