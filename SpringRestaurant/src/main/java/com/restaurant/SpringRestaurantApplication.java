package com.restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRestaurantApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestaurantApplication.class, args);
		System.out.println("welcome to restaurant");
	}

}
