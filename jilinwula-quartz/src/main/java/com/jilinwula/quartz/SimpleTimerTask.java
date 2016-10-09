package com.jilinwula.quartz;

import java.util.Date;
import java.util.TimerTask;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-22 16:17
 * @since 1.0.1
 */
public class SimpleTimerTask extends TimerTask {
    private int count = 0;
    public void run() {
        System.out.println("execute task.");
        Date exeTime = new Date(scheduledExecutionTime());
        System.out.println(String.format("本次任务安排时间点为：%s", exeTime));
        if(++count > 10) {
           cancel();
        }
    }
}
