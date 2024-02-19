package com.restapi.ws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/products")
public class ProductResource {
	private ProductDao  dao = ProductDao.getInstance();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> listAll(){
		return dao.listAll();
	}
}
