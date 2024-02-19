package com.ssandyy.DemoRestApi;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("alien")
public class AlienResource {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Alien getAlien() {
		System.err.println("Hello.........!");
		Alien a1 = new Alien();
		a1.setName("sandeep");
		a1.setPoints(100);
		
		return a1;
	}
}
