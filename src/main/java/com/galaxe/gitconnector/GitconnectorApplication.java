package com.galaxe.gitconnector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class GitconnectorApplication {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	//main method
	public static void main(String[] args) {
		SpringApplication.run(GitconnectorApplication.class, args);
	}
	System.out.println("Testing purpose");
		System.out.println("Pr raised");
		System.out.println("Done");

	


}
