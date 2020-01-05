package com.whb.config;

import io.swagger.annotations.ApiOperation;
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
public class SwaggerConfig {

    @Bean
    public Docket swaggerSpringMvcPlugin() {
        return new Docket(DocumentationType.SWAGGER_2).
                apiInfo(apiInfo()).
                select().
                apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)).
                build();
    }

    /***
     * 构建 api文档的详细信息函数,注意这里的注解引用的是哪个
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("API")
                //创建人
                .contact(new Contact("whb", "http://www.baidu.com", "qianshan_w@163.com"))
                //版本号
                .version("1.0")
                //描述
                .description("API 描述")
                .build();
    }

}
