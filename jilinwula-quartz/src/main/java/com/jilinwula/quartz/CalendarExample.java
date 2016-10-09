package com.jilinwula.quartz;

import org.quartz.*;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.calendar.AnnualCalendar;
import org.quartz.impl.triggers.SimpleTriggerImpl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-22 18:40
 * @since 1.0.1
 */
public class CalendarExample {
    public static void main(String[] args) throws SchedulerException {
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();

        AnnualCalendar annualCalendar = new AnnualCalendar();

        Calendar calendar1 = new GregorianCalendar();
        calendar1.add(Calendar.MONTH, 5);
        calendar1.add(Calendar.DATE, 1);

        Calendar calendar2 = new GregorianCalendar();
        calendar2.add(Calendar.MONTH, 10);
        calendar2.add(Calendar.DATE, 1);

        ArrayList<Calendar> calendars = new ArrayList<Calendar>();
        calendars.add(calendar1);
        calendars.add(calendar2);

        annualCalendar.setDaysExcluded(calendars);

        scheduler.addCalendar("test", annualCalendar, false, false);

        JobDetail jobDetail = new JobDetailImpl("job1", "group1", SimpleJob.class);
        SimpleTriggerImpl simpleTrigger = new SimpleTriggerImpl("trigger1","group1", new Date(), null, SimpleTrigger.REPEAT_INDEFINITELY, 60 * 60 * 1000L);
        simpleTrigger.setCalendarName("test");
        scheduler.scheduleJob(jobDetail, simpleTrigger);
        scheduler.start();
    }
}
