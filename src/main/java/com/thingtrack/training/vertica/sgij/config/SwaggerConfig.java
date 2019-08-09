package com.thingtrack.training.vertica.sgij.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger.web.UiConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.service.Contact;

@Configuration
@EnableSwagger2
@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfig extends WebMvcConfigurationSupport {
	/* Configure Swagger API services */
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)        				 
		                 .select()
		                 	//.apis(RequestHandlerSelectors.any())
		                 	.apis(RequestHandlerSelectors.basePackage("com.thingtrack.training.vertica.sgij.controller"))
		                 	.paths(PathSelectors.any())		                 		                
		                 	.build()		                 	
		                 .apiInfo(metaData());
    }
        
    /* Swagger API metadata information*/
    private ApiInfo metaData() {
        return new ApiInfoBuilder()
                .title("Spring Boot SGIJ REST API")
                .description("\"Spring Boot REST API for Vertica Developer Training SGIJ\"")
                .version("1.0.0")
                .license("Apache License Version 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"")
                .contact(new Contact("Thingtrack", "https://www.thingtrack.com", "miguel@thingtrack.com"))
                .build();
    }
        
    /* Enable the swagger UI */
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
 
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
    
    /* Unable the swagger validation to avoid errors in Pivotal Web services with validatorUrl("") */
    @Bean
    UiConfiguration uiConfig() {
        return UiConfigurationBuilder.builder()
	            .displayRequestDuration(true)
	            .validatorUrl("")
	            .build();
    }
    
    /* Enable CORS */
    @Override
    protected void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
        		.allowedMethods("*")
                //.allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD")
                //.allowedOrigins("http://localhost:4200")
                .allowCredentials(true);
    }
}
