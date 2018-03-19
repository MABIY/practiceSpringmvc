package com.lh.spring.test.web.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = {com.lh.spring.test.application.Components.class, com.lh.spring.test.web.controller.Components.class})
public class WebConfig {
    //@Bean
    //public ViewResolver internalResourceViewResolver() {
    //    InternalResourceViewResolver bean = new InternalResourceViewResolver();
    //    bean.setViewClass(JstlView.class);
    //    bean.setPrefix("/jsp/");
    //    bean.setSuffix(".jsp");
    //    return bean;
    //}

    @Bean
    public FreeMarkerViewResolver freemarkerViewResolver() {
        FreeMarkerViewResolver resolver = new FreeMarkerViewResolver();
        resolver.setCache(true);
        resolver.setPrefix("");
        resolver.setSuffix(".ftl");
        return resolver;
    }


    @Bean
    public FreeMarkerConfigurer freemarkerConfig() {
        FreeMarkerConfigurer freeMarkerConfigurer = new FreeMarkerConfigurer();
        freeMarkerConfigurer.setTemplateLoaderPath("/WEB-INF/views/ftl/");
        return freeMarkerConfigurer;
    }
}