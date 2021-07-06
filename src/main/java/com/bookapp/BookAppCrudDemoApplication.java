package com.bookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class BookAppCrudDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(BookAppCrudDemoApplication.class, args);
		
	
	}

/*	@Bean
 * 
	public Docket swaggerConfiguration2() {

		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build();

	}*/

}
 
