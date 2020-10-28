package com.lsdSpringCloud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    public void addCorsMapping(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedHeaders("*")
                .allowedMethods("POST","GET","PUT","OPTION","DELETE")
                .maxAge(168000)
                .allowCredentials(true);

    }
}
