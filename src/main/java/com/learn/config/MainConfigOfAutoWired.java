package com.learn.config;

import com.learn.bean.User;
import com.learn.dao.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/8/13 15:15<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Configuration
@ComponentScan({"com.learn.service","com.learn.dao","com.learn.controller"})
public class MainConfigOfAutoWired {
    @Bean
    public BookDao bookDao(){
        return new BookDao();
    }

    @Bean
    public User user(){
        return new User();
    }
}
