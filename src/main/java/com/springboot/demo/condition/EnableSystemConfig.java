package com.springboot.demo.condition;

import com.springboot.demo.configurations.WindowsSystemConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({WindowsSystemConfig.class})
public @interface EnableSystemConfig {
}
