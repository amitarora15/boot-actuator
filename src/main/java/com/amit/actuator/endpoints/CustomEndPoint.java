package com.amit.actuator.endpoints;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.lang.Nullable;

import com.amit.actuator.bean.Response;

@Endpoint(enableByDefault = true, id = "custom")
public class CustomEndPoint {

	@ReadOperation(produces = "application/json")
	public Response generate(@Selector Integer id, Integer i) {
		boolean sucess = true;
		Response r = new Response();
		r.setId(id);
		if(i%2 == 0)
			r.setStatus(sucess);
		else
			r.setStatus(!sucess);
		return r;
	}
	
	@WriteOperation(produces = "application/json")
	public void produce(@Selector Integer id,@Nullable Integer i) {
		
	}
	
}
