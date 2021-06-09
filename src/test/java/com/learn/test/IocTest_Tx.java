package com.learn.test;

import com.learn.tx.TxConfig;
import com.learn.tx.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/8/14 20:16<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class IocTest_Tx {
    @Test
    public void testTx(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.userInsert();
        context.close();
    }
}
