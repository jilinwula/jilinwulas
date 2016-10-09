package com.jilinwula.ioc.plugin;

import org.springframework.stereotype.Component;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-21 10:51
 * @since 1.0.1
 */
@Component
public class PluginImpl1 implements Plugin {

    public String getPLuginName() {
        return "用户管理";
    }
}
