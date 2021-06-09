package com.learn.circularDependency;

import org.springframework.stereotype.Component;

/**
 * Description:
 * date: 2021/4/18 21:38
 * Package: com.learn.circularDependency
 *
 * @author 李佳乐
 * @version 1.0
 */
@Component
public class ServiceA {
    private ServiceB serviceB;

    public void setServiceB(ServiceB serviceB){
        this.serviceB = serviceB;
        System.out.println("A里面注入了B");
    }


//    public ServiceA(ServiceB serviceB) {
//        this.serviceB = serviceB;
//    }
}
