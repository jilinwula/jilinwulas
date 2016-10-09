package com.jilinwula.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-22 18:17
 * @since 1.0.1
 */
public class SimpleJob implements Job {
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println(jobExecutionContext.getTrigger().getCalendarName() + "time is:" + new Date());
    }
}
