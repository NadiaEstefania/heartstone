package com.br.heartstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.br.heartstone")
public class HearthStonApplication {

	public static void main(String[] args) {
		SpringApplication.run(HearthStonApplication.class, args);
	}

}
