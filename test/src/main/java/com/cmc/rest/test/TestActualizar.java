package com.cmc.rest.test;

import com.cmc.rest.commons.ValidationException;
import com.cmc.rest.entidades.Persona;
import com.cmc.rest.servicios.ServicioPersonas;

public class TestActualizar {
	
	public static void main(String[] args) {
		//DATOS DE ENTRADA
		Persona p = new Persona("Heibert", "Ocaña", "1234567890");
		System.out.println("*** DATOS DE ENTRADA ***");
		System.out.println(p);
		
		System.out.println("");
		
		//DATOS DE SALIDA
		System.out.println("*** DATOS DE SALIDA ***");
		try {
			ServicioPersonas.actualizar(p);
			System.out.println(p);
		} catch (ValidationException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
