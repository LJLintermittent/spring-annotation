package com.learn.bean;

import com.learn.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/8/12 15:11<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class test {
    public static void main(String[] args) {
        //xml配置bean
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Person bean = (Person) context.getBean("person");
//        System.out.println(bean);
        //注解配置bean
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        Person bean = context.getBean(Person.class);
        System.out.println(bean);
    }
}
