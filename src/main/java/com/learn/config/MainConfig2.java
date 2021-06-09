package com.learn.config;

import com.learn.bean.ColorFactoryBean;
import com.learn.bean.Customer;
import com.learn.bean.Person;
import com.learn.bean.User;
import com.learn.condition.LinuxCondition;
import com.learn.condition.MyImportBeanDefinitionRegistrar;
import com.learn.condition.MyImportSelector;
import com.learn.condition.WindowsCondition;
import com.sun.tracing.ProbeName;
import org.springframework.context.annotation.*;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/8/12 16:19<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Configuration
@Import({User.class, Customer.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class MainConfig2 {

    //多实例创建对象
//    @Scope("prototype")
    @Bean("person")
    @Lazy
    public Person person(){
        return new Person("LLLL",20);
    }

    @Conditional({WindowsCondition.class})
    @Bean("bill")
    public Person person2(){
        return new Person("bill",60);
    }

    @Conditional({LinuxCondition.class})
    @Bean("linus")
    public Person person3(){
        return new Person("linus",50);
    }

    @Bean
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }


}
