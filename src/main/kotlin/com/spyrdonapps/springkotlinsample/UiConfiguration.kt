package com.spyrdonapps.springkotlinsample

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class UiConfiguration : WebMvcConfigurer {
    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        registry.addResourceHandler("/**")
            .addResourceLocations(
                // THESE TWO DON'T WORK WITHOUT EACH OTHER, DON'T TOUCH IT
                "classpath:/css",
                "classpath:/static/css",

                "classpath:/static/js"
            )
            .setCachePeriod(0)
    }
}