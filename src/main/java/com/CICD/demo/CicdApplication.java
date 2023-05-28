package com.CICD.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class CicdApplication {

	@GetMapping("/")
	public String home() {
		return "Welcome Back;";
	}
	public static void main(String[] args) {
		SpringApplication.run(CicdApplication.class, args);
	}

}
