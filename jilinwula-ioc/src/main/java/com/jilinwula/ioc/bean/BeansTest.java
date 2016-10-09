package com.jilinwula.ioc.bean;

import com.jilinwula.ioc.model.Car;
import com.sun.media.jfxmediaimpl.NativeMedia;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jilinwula@foxmail.com
 * @datetime 16/9/14 下午10:02
 */
@Configuration
public class BeansTest {
    @Bean(name = "car")
    public Car buildCar() {
        Car car = new Car();
        car.setBrand("宝来");
        car.setMaxSpeed(20000);
        return car;
    }
}
