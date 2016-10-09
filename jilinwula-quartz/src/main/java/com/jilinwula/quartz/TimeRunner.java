package com.jilinwula.quartz;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-22 16:20
 * @since 1.0.1
 */
public class TimeRunner {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new SimpleTimerTask();
        timer.schedule(task, 1000L, 5000L);
    }
}
