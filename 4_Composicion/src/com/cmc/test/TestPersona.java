package com.cmc.test;

import com.cmc.entidades.Direccion;
import com.cmc.entidades.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		System.out.println("Nombre: " + p1.getNombre());
		System.out.println("Edad: " + p1.getEdad());
		System.out.println("Direccion: " + p1.getDireccion());
		
		//p1.setDireccion(new Direccion()); Solucion
		Direccion dir = p1.getDireccion();
		//Forma de manejar cuando aparece un nullPointerException
		if(dir != null){
			System.out.println("Direcciom calle principal: " + dir.getCallePrincipal());
		}
	}

}
