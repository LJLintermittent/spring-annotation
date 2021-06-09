package com.learn.test;

import com.learn.config.MainConfigOfProfile;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.util.Map;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/8/13 16:48<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class IocTest_Profile {
    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("test","dev");
        context.register(MainConfigOfProfile.class);
        context.refresh();
        String[] beanNamesForType = context.getBeanNamesForType(DataSource.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
        context.close();
    }

}
