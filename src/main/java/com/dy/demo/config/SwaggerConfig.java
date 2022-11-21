package com.dy.demo.config;

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

/**
 * @author zhanglianyong
 * 2022/11/1 11:41
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * 配置docket以配置Swagger具体参数
     * @return 返回一个docket配置参数
     */
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.dy.demo.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * Api的信息
     * @return ApiInfo
     */
    private ApiInfo apiInfo(){
        Contact contact = new Contact("zhanglianyong","https://blog.csdn.net/zly03?spm=1000.2115.3001.5343","lyzhang@163.com");
        return new ApiInfoBuilder()
                .title("demo")
                .version("1.0.0")
                .description("接口文档")
                .contact(contact)
                .build();
    }

}
