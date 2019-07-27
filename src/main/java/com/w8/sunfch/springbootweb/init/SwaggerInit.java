package com.w8.sunfch.springbootweb.init;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerInit {


    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("demo")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.w8.sunfch.springbootweb.controller"))
                .build();
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("API接口文档")
                .description("restful风格接口")
                .termsOfServiceUrl("")
                .version("1.0")
                .contact(new Contact("孙风川", "15053435681", "sunfengchuan@58.com"))
                .build();
    }
}
