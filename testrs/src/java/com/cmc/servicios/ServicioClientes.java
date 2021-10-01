package com.cmc.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cmc.entidades.Cliente;

@Path("/clientes")
public class ServicioClientes {
	
	@Path("/saludo")
	@GET
	public String metodo1(){
		
		return "Saludando desde el rest web service!!";
	}
	
	@Path("/consultar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Cliente consultar(){
		Cliente c = new Cliente("Alice", "1054125478", 20, true);

		return c;
	}
	
	@Path("/guardar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void guardar(Cliente cliente){
		System.out.println("nombre: " + cliente.getNombre());
		System.out.println("cedula: " + cliente.getCedula());
	}
	
}
