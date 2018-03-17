package com.lh.spring.test.web.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = {com.lh.spring.test.application.Components.class, com.lh.spring.test.web.controller.Components.class})
public class DispatcherServlet {
}