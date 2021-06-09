package com.learn.test;

import com.learn.bean.Car;
import com.learn.config.MainConfigOfLife;
import org.junit.Test;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/8/12 22:43<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */

public class IocTest_lifeCycle {
    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfLife.class);
        System.out.println("容器创建完成");
        Car bean = context.getBean(Car.class);
        System.out.println(bean);
        context.close();
    }
}
