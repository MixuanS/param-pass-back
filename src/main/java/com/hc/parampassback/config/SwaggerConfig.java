package com.hc.parampassback.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author hechao
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        // http://localhost:8080/doc.html
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("项目名称") //网站标题
                .description("项目名称swagger RESTful APIs......") //网站描述
                .version("9.0") //版本
                .contact(new Contact("王栋栋","https://blog.csdn.net/Xiaodongge521","wangdongdong0224@163.com")) //联系人
                .license("The Apache License") //协议
                .licenseUrl("http://www.baidu.com") //协议url
                .build();

        return new Docket(DocumentationType.SWAGGER_2) //swagger版本
                .pathMapping("/")
                .select()
                //扫描那些controller
                .apis(RequestHandlerSelectors.basePackage("com.hc.parampassback.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo);
    }


}
