package com.mukhil.webseries;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages="com.mukhil.controller")
@EntityScan(basePackages="com.mukhil.model")
@EnableJpaRepositories(basePackages="com.mukhil.dao")
public class WebSeriesApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(WebSeriesApplication.class, args);
	}

}
