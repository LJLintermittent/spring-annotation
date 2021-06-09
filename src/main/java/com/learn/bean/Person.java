package com.learn.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/8/12 15:03<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class Person {
    @Value("李佳乐")
    private String name;
    @Value("#{18+2}")
    private Integer age;
    @Value("${person.NickName}")
    private String NickName;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", NickName='" + NickName + '\'' +
                '}';
    }
}
