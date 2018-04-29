package com.udemy.backendNinja1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BackendNinja1Application {

	public static void main(String[] args) {
		SpringApplication.run(BackendNinja1Application.class, args);
	}
}
