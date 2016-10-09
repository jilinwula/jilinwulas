package com.jilinwula.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author jilinwula@foxmail.com
 * @datetime 16/9/17 下午9:30
 */
@Repository
public class ViewSpaceDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void initDb() {
        String sql = "create table user(user_id int primary key, user_name varchar(60))";
        jdbcTemplate.execute(sql);
    }

    public void addViewSpace(ViewSpace viewSpace) {
        final String sql = "INSERT INTO t_view_space(space_name,description,address) VALUES(?,?,?)";
        Object [] params = new Object[]{viewSpace.getSpaceName(), viewSpace.getDescription(), viewSpace.getAddress()};
        jdbcTemplate.update(sql, params, new PreparedStatementSetter() {
            public void setValues(PreparedStatement preparedStatement) throws SQLException {
            }
        });
    }
}
