package com.learn.tx;

import com.learn.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/8/14 20:07<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Transactional
    public void userInsert(){
        userDao.insert();
        int i = 10/0;
    }

}
