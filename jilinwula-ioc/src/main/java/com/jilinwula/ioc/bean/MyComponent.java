package com.jilinwula.ioc.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author jilinwula@foxmail.com
 * @datetime 16/9/15 下午2:55
 */
@Component
public class MyComponent {
    @Autowired(required = false)
    public List<Plugin> plugins;

    public List<Plugin> getPlugins() {
        return plugins;
    }

    @Override
    public String toString() {
        return "MyComponent{" +
                "plugins=" + plugins +
                '}';
    }

    public void setPlugins(List<Plugin> plugins) {
        this.plugins = plugins;
    }
}
