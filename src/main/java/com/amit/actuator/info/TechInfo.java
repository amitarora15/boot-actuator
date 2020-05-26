package com.amit.actuator.info;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.stereotype.Component;

import com.amit.actuator.health.TechHealthIndicator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.info.InfoContributor;

@Component
public class TechInfo implements InfoContributor {

	@Override
	public void contribute(Builder builder) {
		Map<String, Object> map = new HashMap<>();
		map.put("I-VAL", TechHealthIndicator.i);
		builder.withDetails(map).build();

	}

}
