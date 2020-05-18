package com.stzhangjk.demo.springdata.jpa.config;


import org.apache.commons.io.FileUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Date;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket docket() throws IOException {

        String swaggerDesc = FileUtils.readFileToString(ResourceUtils.getFile(ResourceUtils.CLASSPATH_URL_PREFIX + "swagger-desc.md"), StandardCharsets.UTF_8);

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.stzhangjk.demo.springdata.jpa.controller"))
                .paths(PathSelectors.any())
                .build()
                .pathMapping("/")
                .directModelSubstitute(Date.class, String.class)
                .useDefaultResponseMessages(false)
                .apiInfo(new ApiInfoBuilder()
                        .title("JPA Demo")
                        .description(swaggerDesc)
                        .build()
                );
    }
}
