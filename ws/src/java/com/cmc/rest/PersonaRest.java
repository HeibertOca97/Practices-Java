package com.cmc.rest;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.cmc.rest.commons.ArchivoException;
import com.cmc.rest.commons.ValidationException;
import com.cmc.rest.entidades.Persona;
import com.cmc.rest.servicios.ManejadorArchivos;
import com.cmc.rest.servicios.ServicioPersonas;

@Path("/personas")
public class PersonaRest {
	
	@Path("/cambiar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Persona modificar(Persona persona){
		System.out.println(persona);
		try {
			ServicioPersonas.actualizar(persona);
		} catch (ValidationException e) {
			e.printStackTrace();
		}
		return persona;
	}
	
	@Path("/cambio")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response cambiar(Persona persona){
		System.out.println(persona);
		try {
			ServicioPersonas.actualizar(persona);
		} catch (ValidationException ex) {
			return Response.status(200).entity(ex.getMessage()).build();
		}
		
		return Response.status(200).entity(persona).build();
	}
	
	@Path("/consultarClientes")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response consultarPersonas(){
		ManejadorArchivos archivo = new ManejadorArchivos("personas.txt");
		try {
			ArrayList<Persona> listado = archivo.leer();
			return Response.status(200).entity(listado).build();
		} catch (ArchivoException e) {
			e.printStackTrace();
			return Response.status(200).entity(e.getMessage()).build();
		}
	} 
	
	@Path("/ver/{cedula}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarPorCedula(@PathParam("cedula") String cedula){
		Persona recuperar = ServicioPersonas.buscarPorCedula(cedula);
		System.out.println(recuperar);
		
		return Response.status(200).entity(recuperar).build();
	}
	
	@Path("/agregar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response agregarPersona(Persona persona){
		ManejadorArchivos archivo = new ManejadorArchivos("personas.txt");
		try {
			archivo.agregarPersona(persona);
		} catch (ArchivoException ex) {
			return Response.status(200).entity(ex.getMessage()).build();
		}
		
		try {
			ArrayList<Persona> listado = archivo.leer();
			return Response.status(200).entity(listado).build();
		} catch (ArchivoException ex2) {
			return Response.status(200).entity(ex2.getMessage()).build();
		}
	}
	
}
