package com.learn.config;

import com.learn.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/8/12 22:36<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@ComponentScan("com.learn.bean")
@Configuration
public class MainConfigOfLife{

    @Scope("prototype")
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Car car(){
        return new Car();
    }

}
