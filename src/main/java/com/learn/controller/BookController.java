package com.learn.controller;

import com.learn.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/8/12 15:31<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Controller
public class BookController {
    @Autowired
    //@Qualifier:指定需要装配的组件的id.而不是使用属性名
    private BookService bookService;
}
