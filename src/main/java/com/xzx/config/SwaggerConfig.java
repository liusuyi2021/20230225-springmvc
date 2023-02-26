package com.xzx.config;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName SwaggerConfig
 * @Description:
 * @Author 刘苏义
 * @Date 2023/2/25 19:33
 * @Version 1.0
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig{
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .build()
                .pathMapping("/") // 方法的url映射路径
                .apiInfo(apiInfo());
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger测试API")
                .description("测试使用")
                .version("1.0.0")
                .termsOfServiceUrl("http://xxx.xxx.com")
                .license("license")
                .licenseUrl("http://xxx.xxx.com")
                .build();
    }
}

