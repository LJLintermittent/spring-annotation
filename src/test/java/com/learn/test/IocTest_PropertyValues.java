package com.learn.test;

import com.learn.config.MainConfigOfPropertyValues;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import javax.naming.NameNotFoundException;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/8/13 14:50<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class IocTest_PropertyValues {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);
    public void print(AnnotationConfigApplicationContext context){
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void test1(){
        print(context);
        Object person = context.getBean("person");
        System.out.println(person);
        ConfigurableEnvironment environment = context.getEnvironment();
        String property = environment.getProperty("person.NickName");
        System.out.println(property);
        context.close();
    }
}
