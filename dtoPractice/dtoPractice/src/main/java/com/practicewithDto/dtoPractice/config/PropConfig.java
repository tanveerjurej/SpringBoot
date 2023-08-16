package com.practicewithDto.dtoPractice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources(@PropertySource("classpath:student-error.properties"))
public class PropConfig {
}
