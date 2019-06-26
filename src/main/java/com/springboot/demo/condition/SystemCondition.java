package com.springboot.demo.condition;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

@Slf4j
public class SystemCondition implements Condition {

    /**
     * 实现Condition接口，重写matches方法
     * @param conditionContext
     * @param annotatedTypeMetadata
     * @return
     */
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        log.debug("----------> here is matches() of "+ this.getClass());
        // 获取到注解传入的参数
//        String system = conditionContext.getEnvironment().getProperty("system");
        Map<String, Object> annotationAttributes = annotatedTypeMetadata.getAnnotationAttributes(ConditionalOnSystemProperty.class.getName());
        String system = String.valueOf(annotationAttributes.get("value"));
        if ("windows".equals(system)) {
            return true;
        }
        return false;
    }
}
