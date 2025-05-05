package com.h2database.h2database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan
public class H2databaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2databaseApplication.class, args);
	}

}
