package com.demo.svb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//It's same as declaring a class with @Configuration, @EnableAutoConfiguration and @ComponentScan annotations
//to mark a configuration class that declares one or more @Bean methods and also triggers auto-configuration and component scanning.
public class SvbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SvbApplication.class, args);
	}

}
