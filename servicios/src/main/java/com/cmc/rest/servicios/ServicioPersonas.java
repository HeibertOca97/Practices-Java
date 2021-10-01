package com.cmc.rest.servicios;

import java.util.ArrayList;

import com.cmc.rest.commons.ArchivoException;
import com.cmc.rest.commons.ValidationException;
import com.cmc.rest.entidades.Persona;

public class ServicioPersonas {
	
	public static Persona actualizar(Persona persona) throws ValidationException{
		
		if(persona.getNombre().length() <= 3){
			throw new ValidationException("El nombre es muy corto");
		}
		
		if(persona.getApellido().length() <= 3){
			throw new ValidationException("El apellido es muy corto");
		}
		
		persona.setNombre(persona.getNombre().toUpperCase());
		persona.setApellido(persona.getApellido().toUpperCase());			
		
		return persona;
	}
	
	public static Persona buscarPorCedula(String cedula){
		ManejadorArchivos archivo = new ManejadorArchivos("personas.txt");
		try {
			Persona recuperada = null;
			ArrayList<Persona> listado = archivo.leer();
			for(Persona persona : listado){
				System.out.println("Lista: " + persona.getApellido());
				if(persona.getCedula().equals(cedula)){
					System.out.println(persona);
					recuperada = persona;
					return recuperada;
				}
			}
		} catch (ArchivoException e) {
			e.printStackTrace();
		}
		return null;
	}

}
