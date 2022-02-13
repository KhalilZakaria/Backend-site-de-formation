package com.example.Formations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration("classpath:application-" + "${spring.profiles.active}" + ".properties")
public class FormationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormationsApplication.class, args);
	}

}
