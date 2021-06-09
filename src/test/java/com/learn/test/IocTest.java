package com.learn.test;


import com.learn.bean.Blue;
import com.learn.bean.ColorFactoryBean;
import com.learn.bean.Person;
import com.learn.config.MainConfig;
import com.learn.config.MainConfig2;
import com.learn.exe.ExeConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.test.context.TestPropertySource;

import javax.naming.NameNotFoundException;
import javax.print.DocFlavor;
import java.util.ConcurrentModificationException;
import java.util.Map;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/8/12 15:42<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class IocTest {
    @Test
    public void testIoc(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void testMyConfig2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        Object person = context.getBean("person");
        Object person1 = context.getBean("person");
        System.out.println(person == person1);
    }

    @Test
    public void testCondition(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        ConfigurableEnvironment environment = context.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println(property);
        String[] beanNamesForType = context.getBeanNamesForType(Person.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
        Map<String, Person> personMap = context.getBeansOfType(Person.class);
        System.out.println(personMap);

    }

    @Test
    public void testImport(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        Blue bean = context.getBean(Blue.class);
        System.out.println(bean);

        //获取工厂bean本身
        //要加&
        Object bean1 = context.getBean("&colorFactoryBean");
        System.out.println(bean1.getClass());
    }

    @Test
    public void testEvent(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ExeConfig.class);
        context.publishEvent(new ApplicationEvent(new String("我发布的事件")) {
        });
        context.close();
    }


}
