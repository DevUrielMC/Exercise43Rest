package com.exercise43rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/Mensajes")					//http://localhost:8080/ esto es el dominio exercise43rest/rest path para acceder a la clase /Mensajes
public class Mensajes {
	
	@GET
	public String sayHello() 
	{
		return "Hi Knee Breacker";
	}

	
}
