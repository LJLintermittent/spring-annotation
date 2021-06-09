package com.learn.config;

import com.learn.bean.Person;
import com.learn.service.BookService;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/8/12 15:20<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Configuration
@ComponentScans(value = {
        @ComponentScan(value = "com.learn",includeFilters = {
//                @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class}),
//                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {BookService.class})
                @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})
        },useDefaultFilters = false)
})
public class MainConfig {
    @Bean
    public Person person(){
        return new Person("李佳乐",20);
    }

}
