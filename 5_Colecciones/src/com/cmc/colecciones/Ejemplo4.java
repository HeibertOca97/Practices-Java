package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Persona;

public class Ejemplo4 {

	public static void main(String[] args) {
		ArrayList<Persona> persona = new ArrayList<Persona>();
		
		persona.add(new Persona("Maikol", 25));
		persona.add(new Persona("Taylor", 29));
		persona.add(new Persona("Sofia", 24));
		
		System.out.println("Tamaño: " + persona.size());
		
		Persona per = null;
		for (int i = 0; i < persona.size(); i++) {
			per = persona.get(i);
			System.out.println("Nombre: " + per.getNombre()+" Edad: "+per.getEdad());
		}
	}

}