package com.fly.web.springboot.web.common.swagger;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 张攀钦
 * @date 2018-08-27-18:48
 * Swagger配置文件
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /**
     * @author 张攀钦
     * @date 2018/12/27-22:30
     * 项目名称
     */
    private final String SWAGGER2_API_GROUP_NAME = "zpq";
    /**
     * @author 张攀钦
     * @date 2018/12/27-22:31
     * 扫描路径
     */
    private final String SWAGGER2_API_BASEPACKAGE = "com.fly";
    /**
     * @author 张攀钦
     * @date 2018/12/27-22:32
     * title
     */
    private final String SWAGGER2_API_TITLE = "Fly-SpringBoot";

    /**
     * @author 张攀钦
     * @date 2018/12/27-22:32
     * api介绍
     */

    private final String SWAGGER2_API_DESCRIPTION = "[SpringBoot 官方文档](https://docs.spring.io/spring-boot/docs/2.1.7.RELEASE/reference/html/)";

    /**
     * @author 张攀钦
     * @date 2018/12/27-22:32
     * 网站
     */

    private final String SWAGGER2_API_URL = "https://spring.io/projects/spring-boot/";
    /**
     * @author 张攀钦
     * @date 2018/12/27-23:07
     * 联系人
     */
    private final String SWAGGER2_API_AUTHOR = "Authorize";
    private final String SWAGGER2_API_EMAIL = "zhangpanqin@outlook.com";
    /**
     * @author 张攀钦
     * @date 2018/12/27-22:32
     * api版本
     */
    private final String SWAGGER2_API_VERSION = "1.0";

    @Bean
    public Docket createRestApi() {
        Predicate<RequestHandler> requestHandlerPredicate = RequestHandlerSelectors.withClassAnnotation(Api.class);
        Predicate<RequestHandler> requestHandlerPredicate1 = RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class);


        Predicate<RequestHandler> or = Predicates.or(requestHandlerPredicate, requestHandlerPredicate1);
        return new Docket(DocumentationType.SWAGGER_2).groupName(SWAGGER2_API_GROUP_NAME).apiInfo(apiInfo()).select()
//                .apis(RequestHandlerSelectors.basePackage(SWAGGER2_API_BASEPACKAGE))
                .apis(or).paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title(SWAGGER2_API_TITLE).description(SWAGGER2_API_DESCRIPTION)
//                .termsOfServiceUrl(SWAGGER2_API_URL)
                .version(SWAGGER2_API_VERSION).contact(new Contact(SWAGGER2_API_AUTHOR, null, SWAGGER2_API_EMAIL)).build();
    }

}
