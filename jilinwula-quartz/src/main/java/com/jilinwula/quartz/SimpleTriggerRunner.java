package com.jilinwula.quartz;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.triggers.SimpleTriggerImpl;

import java.util.Date;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-22 18:16
 * @since 1.0.1
 */
public class SimpleTriggerRunner {
    public static void main(String[] args) throws SchedulerException {
        JobDetail jobDetail = new JobDetailImpl("job1_1","jgroup1", SimpleJob.class);
        SimpleTriggerImpl simpleTrigger = new SimpleTriggerImpl("trigger1_1","tgroup1");
        simpleTrigger.setStartTime(new Date());
        simpleTrigger.setRepeatInterval(2000);
        simpleTrigger.setRepeatCount(100);

        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();
        scheduler.scheduleJob(jobDetail, simpleTrigger);
        scheduler.start();
    }
}
