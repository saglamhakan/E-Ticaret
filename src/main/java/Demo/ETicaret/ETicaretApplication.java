package Demo.ETicaret;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@Configuration
//@EnableSwagger2
public class ETicaretApplication {

	public static void main(String[] args) {
		SpringApplication.run(ETicaretApplication.class, args);
	}

/*	@Bean
	public Docket api(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("E-Ticaret"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(new ApiInfoBuilder().title("E-Ticaret").description("E-Ticaret api").build());
	}

 */
}
