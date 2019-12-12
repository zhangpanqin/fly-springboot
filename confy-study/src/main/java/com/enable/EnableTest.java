package com.enable;

import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author uinnova
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(EnableConfigurationSelector.class)
public @interface EnableTest {
    AdviceMode mode() default AdviceMode.PROXY;
}