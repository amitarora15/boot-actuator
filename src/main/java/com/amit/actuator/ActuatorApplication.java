package com.amit.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.amit.actuator.endpoints.CustomEndPoint;

@SpringBootApplication
public class ActuatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActuatorApplication.class, args);
	}
	
	@Bean
	public CustomEndPoint getEndPoint() {
		return new CustomEndPoint();
	}

}
