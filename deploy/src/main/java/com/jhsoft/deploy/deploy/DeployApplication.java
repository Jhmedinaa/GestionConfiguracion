package com.jhsoft.deploy.deploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeployApplication.class, args);
	}
}
