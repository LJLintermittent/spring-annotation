package com.learn.bean;

import org.springframework.beans.factory.FactoryBean;


/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/8/12 22:14<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class ColorFactoryBean implements FactoryBean<Color> {

    @Override
    public Color getObject() throws Exception {
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
