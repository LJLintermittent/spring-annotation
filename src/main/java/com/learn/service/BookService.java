package com.learn.service;

import com.learn.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/8/12 15:31<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Service
public class BookService {
//    @Primary
//    @Qualifier
//    @Resource

    @Autowired
    private BookDao bookDao;

    public void print(){
        System.out.println(bookDao);
    }

    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao +
                '}';
    }
}
