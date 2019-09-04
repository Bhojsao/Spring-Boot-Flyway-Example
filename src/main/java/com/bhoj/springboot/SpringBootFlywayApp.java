package com.bhoj.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Flyway App Main Class
 * 
 * @author Bhoj
 *
 */
@SpringBootApplication(scanBasePackages = { "com.bhoj.springboot" })
public class SpringBootFlywayApp {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootFlywayApp.class, args);
	}
}
