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
public class ServiceB {
    private ServiceA serviceA;

    public void setServiceA(ServiceA serviceA){
        this.serviceA = serviceA;
    }

//    public ServiceB(ServiceA serviceA) {
//        this.serviceA = serviceA;
//    }
}
