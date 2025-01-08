package com.example.graphqldemo

import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.config.CorsRegistry

@Configuration
class SecurityConfig : WebMvcCon {


    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**")
            .allowedOriginPatterns("**", "*")
            .allowedMethods("*")
            .allowedHeaders("*")
            .allowCredentials(true)
            .maxAge(3600)
    }

}