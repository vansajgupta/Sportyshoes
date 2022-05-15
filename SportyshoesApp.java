package com.spring.foobar.demo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SportyshoesApp {

	public static void main(String[] args) {
		SpringApplication.run(SportyshoesApp.class, args);
		System.out.println("sporty shoes run success!!");
	}

	
	  @Bean
	    public Docket swaggerConfiguration() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("com.spring.boot.project.sportyshoes.demo"))
	                .build()
	                .apiInfo(apiDetails());
	    }
	    
	    private ApiInfo apiDetails() {
	        return new ApiInfo(
	                "Sportyshoes API",
	                "Spring Boot REST API for sportyshoes.com",
	                "1.0",
	                "Free to use",
	                new springfox.documentation.service.Contact("Akash Das", "https://github.com/akash-coded/", "mfs.akash@gmail.com"),
	                "API License",
	                "https://github.com/akash-coded/",
	                Collections.emptyList()
	                );
	    }


}
