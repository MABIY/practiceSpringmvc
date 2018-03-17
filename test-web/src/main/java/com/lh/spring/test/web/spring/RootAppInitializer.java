package com.lh.spring.test.web.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {com.lh.spring.test.infrastructure.Components.class})
public class RootAppInitializer {
}
