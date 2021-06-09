package com.learn.test;

import com.learn.aop.MathCalculator;
import com.learn.config.MainConfigOfAOP;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class IocTest_Aop {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);
        MathCalculator mathCalculator = context.getBean(MathCalculator.class);
        mathCalculator.div(10,2);
        context.close();
    }

}
