package com.api.palindrome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class PalindromeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PalindromeApplication.class, args);
	}

}
