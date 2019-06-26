package com.springboot.demo.configurations;

import com.springboot.demo.condition.ConditionalOnSystemProperty;
import com.springboot.demo.condition.SystemCondition;
import com.springboot.demo.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

// 由于使用了EnableSystemConfig注解，在这个注解中使用Import导入了本类，所以无需使用Configuration注解
//@Configuration
@Slf4j
public class WindowsSystemConfig {
    @Bean
    @ConditionalOnSystemProperty("windows")
    public User condition() {
        log.debug("当system为windows时才初始化这个bean");
        return new User();
    }

}
