package com.example.springJWT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class SpringJwtApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
		System.setProperty("jwt.secret", dotenv.get("JWT_SECRET"));

		SpringApplication.run(SpringJwtApplication.class, args);
	}

}
