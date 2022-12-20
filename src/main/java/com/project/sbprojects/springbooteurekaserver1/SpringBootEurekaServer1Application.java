package com.project.sbprojects.springbooteurekaserver1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootEurekaServer1Application {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaServer1Application.class, args);
	}

}
