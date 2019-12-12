package com.fly.spring.enable;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author 张攀钦
 * @date 2019-12-11-19:00
 * @description
 */
public class EnableMyConfigurationSelector implements DeferredImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.fly.spring.enable.MyConfiguration"};
    }
}
