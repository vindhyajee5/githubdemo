package com.vindhya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubactionappsApplication {
	
	
	@GetMapping("/hello")
	public String get()
	{
		return "Hello Vindhya";
		
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubactionappsApplication.class, args);
	}

}
