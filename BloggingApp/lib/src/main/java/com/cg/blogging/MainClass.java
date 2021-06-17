package com.cg.blogging;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



/*import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;*/

/*@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.cg.blogging")
@EnableJpaRepositories(basePackages="com.cg.blogging.repository")
@EntityScan(basePackages="com.cg.blogging.entities") */


//This is the main file of Blogging Application
@SpringBootApplication
@EnableSwagger2
public class MainClass {

	public static void main(String[] args) {
		SpringApplication.run(MainClass.class, args);
		System.out.println("Running on 8081");
	}
	
	//Swagger api is used to do url documentation
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.cg.blogging"))
				//.paths(PathSelectors.ant("/admin/*"))
				.build();
		 // swagger documentation can be accessed on the following URL
	    // http:localhost:8081/swagger-ui.html
	}

}//ApiSelectorBuilder


/*package com.fms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//This is the main file of the Feedback Management System
@SpringBootApplication
@ComponentScan(basePackages = "com.fms")
@EnableSwagger2
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Running on 8086");

	}

	//Swagger api is used to do url documentation
	@Bean
	public Docket fmsapi() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.fms"))
				.build();
		// swagger documentation can be accessed on the following URL
		// http:localhost:8086/swagger-ui.html
	}

}*/

