package com.learn.condition;

import com.learn.bean.Yellow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/8/12 22:01<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean red = registry.containsBeanDefinition("com.learn.bean.Red");
        boolean blue = registry.containsBeanDefinition("com.learn.bean.Blue");
        if (red && blue) {
            RootBeanDefinition beanDefinition = new RootBeanDefinition(Yellow.class);
            registry.registerBeanDefinition("com.learn.bean.Yellow",beanDefinition);
        }
    }
}
