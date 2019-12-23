package com.globomatics.bikes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@EnableJpaRepositories({"com.globomatics.bikes.repositories"})

public class BikesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BikesApplication.class, args);
	}

}
