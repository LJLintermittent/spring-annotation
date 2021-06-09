package com.learn.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.function.Predicate;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/8/12 21:49<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class MyImportSelector implements ImportSelector {


    public String[] selectImports(AnnotationMetadata annotationMetadata) {

        return new String[]{"com.learn.bean.Blue","com.learn.bean.Red"};
    }

    public Predicate<String> getExclusionFilter() {
        return null;
    }
}
