package com.spring.trasaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringTrasactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTrasactionApplication.class, args);
	}

}
