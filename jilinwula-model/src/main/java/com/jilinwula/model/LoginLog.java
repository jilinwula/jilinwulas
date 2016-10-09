package com.jilinwula.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jilinwula@foxmail.com
 * @datetime 16/9/14 下午4:54
 */
public class LoginLog implements Serializable {
    private static final long serialVersionUID = 3596424424116373611L;
    private int loginLogId;
    private int userId;
    private String ip;
    private Date loginDate;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(int loginLogId) {
        this.loginLogId = loginLogId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }
}
