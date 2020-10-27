package com.danilson.appspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.danilson.appspringboot.repositories")
@EntityScan("com.danilson.appspringboot.model")
@SpringBootApplication
public class AppspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppspringbootApplication.class, args);
	}

}
