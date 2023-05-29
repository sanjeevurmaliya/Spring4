package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Spring4Application {
	
    @Autowired
	private Environment environment;
    
    
	public static void main(String[] args) {
		SpringApplication.run(Spring4Application.class, args);
		
	}
	
	@GetMapping("/rest/test")
	public String sayHi()
	{
		String  serverPort= environment.getProperty("server.port");
        System.out.println(environment.getProperty("server.port")+" ServerPort : "+serverPort);
		return "Welcome to Spring Boot";
	}

}
