package com.jilinwula.ioc.model;

import java.util.*;

/**
 * @author jilinwula@foxmail.com
 * @datetime 16/9/14 下午11:49
 */
public class Boss {
    private String name;
    private Car car;
    private Office office;
    private List<String> favorites = new ArrayList<String>();
    private Map<String, String> jobs = new HashMap<String, String>();
    private Properties mails = new Properties();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boss() {
    }

    public Properties getMails() {
        return mails;
    }

    public void setMails(Properties mails) {
        this.mails = mails;
    }

    public Map<String, String> getJobs() {
        return jobs;
    }

    public void setJobs(Map<String, String> jobs) {
        this.jobs = jobs;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "favorites=" + favorites +
                ", jobs=" + jobs +
                ", mails=" + mails +
                '}';
    }

    public Boss(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public List<String> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<String> favorites) {
        this.favorites = favorites;
    }

    public Boss(String name, Car car, Office office) {
        this.name = name;
        this.car = car;
        this.office = office;
    }

}
