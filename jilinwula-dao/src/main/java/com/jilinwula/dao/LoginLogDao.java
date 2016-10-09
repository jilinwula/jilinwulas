package com.jilinwula.dao;

import com.jilinwula.model.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author jilinwula@foxmail.com
 * @datetime 16/9/14 下午5:40
 */
@Repository
public class LoginLogDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertLoginLog(LoginLog loginLog) {
        String sqlStr=  "INSERT INTO t_login_log(user_id,ip,login_datetime) VALUES(?,?,?)";
        Object [] args = {loginLog.getUserId(), loginLog.getIp(), loginLog.getLoginDate()};
        jdbcTemplate.update(sqlStr, args);
    }
}
