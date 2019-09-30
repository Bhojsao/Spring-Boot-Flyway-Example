package com.bhoj.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Spring Boot Flyway App Main Class
 * 
 * @author Bhoj
 *
 */
@SpringBootApplication(scanBasePackages = { "com.bhoj.springboot" })
@EnableEurekaClient
public class SpringBootFlywayApp {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootFlywayApp.class, args);
	}
}
