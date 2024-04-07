package com.example.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsdemoApplication {
	
	@PostConstruct
	public void init()
	{
		System.out.println("Application Started");
		System.out.println("Second Statement");
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsdemoApplication.class, args);
	}

}
