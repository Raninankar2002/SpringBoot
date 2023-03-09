package com.anudiphome.app;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages=("com.link"))
public class AnudipHomeLinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnudipHomeLinkApplication.class, args);
	}

}
