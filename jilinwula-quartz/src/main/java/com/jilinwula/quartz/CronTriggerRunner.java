package com.jilinwula.quartz;

import org.quartz.*;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.triggers.CronTriggerImpl;

import java.text.ParseException;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-22 18:31
 * @since 1.0.1
 */
public class CronTriggerRunner {
    public static void main(String[] args) throws ParseException, SchedulerException {
        JobDetail jobDetail = new JobDetailImpl("job1_1","jgroup1", SimpleJob.class);
        CronTriggerImpl cronTrigger = new CronTriggerImpl("trigger1_2", "tgroup1");
        CronExpression cronExpression = new CronExpression("0/5 * * * * ?");
        cronTrigger.setCronExpression(cronExpression);

        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();
        scheduler.scheduleJob(jobDetail, cronTrigger);
        scheduler.start();
    }
}
