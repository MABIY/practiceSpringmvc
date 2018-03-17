package com.lh.spring.test.infrastructure.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {com.lh.spring.test.domain.Components.class})
public class InfrastructureSpringConfig {
}
