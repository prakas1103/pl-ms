package com.cts.plms.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserRepositoryWithJdbc {
    @Autowired
    JdbcTemplate jdbcTemplate;
    class UserRowMapper implements RowMapper<User> {
        @Override
        public User mapRow(ResultSet rs, int rowNUm) throws SQLException {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("user_name"));
            user.setActive(rs.getString("active"));
            user.setPwd(rs.getString("pwd"));
            user.setUsergroup(rs.getString("user_group"));
            return user;
        }
    }

    public List< User > findAll() {
        return jdbcTemplate.query("select * from user", new UserRowMapper());
    }

}
