package com.jilinwula.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.context.ApplicationContext;

import java.util.Map;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-22 15:54
 * @since 1.0.1
 */
public class MyJob implements Job {
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        Map dataMap = jobExecutionContext.getJobDetail().getJobDataMap();
        String size = (String) dataMap.get("size");
        ApplicationContext ctx = (ApplicationContext) dataMap.get("applicationContext");
        System.out.println(String.format("size:%s", size));
        dataMap.put("size", size + "0");
    }
}
