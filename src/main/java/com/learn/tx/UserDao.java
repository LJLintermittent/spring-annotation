package com.learn.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/8/14 20:07<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert(){
        String sql = "insert into `t_book`(username,ustutas) values (?,?)";
        String username = UUID.randomUUID().toString().substring(0, 5);
        String ustutas = "SS";
        jdbcTemplate.update(sql,username,ustutas);
    }

}
