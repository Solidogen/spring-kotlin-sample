package com.spyrdonapps.springkotlinsample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(AppProperties::class)
class SpringKotlinSampleApplication

fun main(args: Array<String>) {
    runApplication<SpringKotlinSampleApplication>(*args)
}
