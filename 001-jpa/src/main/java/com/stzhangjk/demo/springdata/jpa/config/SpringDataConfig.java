package com.stzhangjk.demo.springdata.jpa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@Configuration
@EnableSpringDataWebSupport
@EnableJpaRepositories(basePackages = "com.stzhangjk.demo.springdata.jpa.dao")
public class SpringDataConfig {
}
