package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedOrigins("*") // 允许所有来源访问
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // 明确允许的HTTP方法
                .allowedHeaders("*") // 允许所有请求头
                .allowCredentials(false) // 不允许发送凭证信息
                .maxAge(3600); // 预检请求的有效期，单位为秒
    }
}