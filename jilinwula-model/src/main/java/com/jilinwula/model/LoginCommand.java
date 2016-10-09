package com.jilinwula.model;

/**
 * @author jilinwula@foxmail.com
 * @datetime 16/9/14 下午6:28
 */
public class LoginCommand {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
