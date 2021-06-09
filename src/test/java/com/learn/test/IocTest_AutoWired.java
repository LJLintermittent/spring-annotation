package com.learn.test;

import com.learn.config.MainConfigOfAutoWired;
import com.learn.dao.BookDao;
import com.learn.service.BookService;
import com.sun.media.sound.SoftTuning;
import org.junit.Test;
import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/8/13 15:28<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */

public class IocTest_AutoWired {
    @Autowired
    private BookService bookService;
    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfAutoWired.class);
        BookService bean = context.getBean(BookService.class);
        System.out.println(bean);
        BookDao bean1 = context.getBean(BookDao.class);
        System.out.println(bean1);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        context.close();
    }
}
