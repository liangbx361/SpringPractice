package com.liangbx.practice.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringSampleApplication {

	@RequestMapping("/")
	public String index(){
		return "Hello Spring Boot World";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSampleApplication.class, args);
	}
}
