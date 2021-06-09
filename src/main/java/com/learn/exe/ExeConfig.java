package com.learn.exe;

import com.learn.bean.Blue;
import com.learn.bean.User;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/8/14 20:56<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Configuration
@ComponentScan("com.learn.exe")
public class ExeConfig {

    @Bean
    public User user(){
        return new User();
    }

}
