package com.jilinwula.jdbc;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * @author jilinwula@foxmail.com
 * @datetime 16/9/17 下午9:17
 */
public class JdbcTemplateTest {
    @Test
    public void test1() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/sampledb");
        ds.setUsername("root");
        ds.setPassword("root");

        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(ds);

        String sql = "create table user(user_id int primary key, user_name varchar(60))";
        jdbcTemplate.execute(sql);
    }
}
