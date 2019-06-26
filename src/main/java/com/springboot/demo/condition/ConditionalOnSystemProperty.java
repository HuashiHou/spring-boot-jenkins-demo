package com.springboot.demo.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
@Conditional(SystemCondition.class)
public @interface ConditionalOnSystemProperty {
    String value();
}
