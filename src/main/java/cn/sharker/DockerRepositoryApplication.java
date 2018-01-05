package cn.sharker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication @EnableEurekaClient
public class DockerRepositoryApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DockerRepositoryApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DockerRepositoryApplication.class);
	}
}
