package com.amit.actuator.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

@Component
public class TechHealthIndicator implements HealthIndicator{

	public static Integer i = 1;
	
	@Override
	public Health health() {
		i++;
		if(i % 7 == 0 ) {
			return Health.status(new Status("FATAL", "Fatal happen")).withDetail("I-VAL", i).build();
		}
		if(i%5 == 0 ) {
			Throwable t = new IllegalArgumentException("s");
			return Health.outOfService().withException(t).withDetail("I-VAL", i).build();
		}
		if(i % 2 == 0) {
			return Health.up().withDetail("I-VAL", i).build();
		} 
		else {
			return Health.down().withDetail("I-VAL", i).build();
		}
		
	}

}
