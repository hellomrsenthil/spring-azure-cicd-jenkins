package com.hellomrsenthil.springazurecicdjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoApplication {
	
	@GetMapping("/")
	public String index(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoApplication.class, args);
		System.out.println("Spring Azure Demo on Azure is running");
	}

}
