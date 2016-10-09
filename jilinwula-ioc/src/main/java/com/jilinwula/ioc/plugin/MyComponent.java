package com.jilinwula.ioc.plugin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-21 10:54
 * @since 1.0.1
 */
@Component
public class MyComponent {
    @Autowired(required = false)
    private List<Plugin> plugins;

    public List<Plugin> getPlugins() {
        return plugins;
    }

    public void setPlugins(List<Plugin> plugins) {
        this.plugins = plugins;
    }
}
