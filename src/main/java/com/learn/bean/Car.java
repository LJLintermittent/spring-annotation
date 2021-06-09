package com.learn.bean;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/8/12 22:39<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Component
public class Car {
    public Car(){
        System.out.println("car constructor");
    }
    @PostConstruct
    public void init(){
        System.out.println("car...init @PostConstruct");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("car ..@PreDestroy");
    }

}
