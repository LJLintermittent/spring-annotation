package com.learn.circularDependency;

/**
 * Description:
 * date: 2021/4/18 21:38
 * Package: com.learn.circularDependency
 *
 * @author 李佳乐
 * @version 1.0
 */
//构造器  无法 构成循环依赖
public class ClientConstructor {
    public static void main(String[] args) {
//        new ServiceA(new ServiceB(new ServiceA()))

        ServiceA serviceA = new ServiceA();
        ServiceB serviceB = new ServiceB();
        serviceA.setServiceB(serviceB);

        serviceB.setServiceA(serviceA);
    }

}
