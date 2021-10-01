package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Persona;

public class Ejemplo3 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		ArrayList<Persona> listaPersona = new ArrayList<Persona>();
		
		lista.add("Hello world");
		listaPersona.add(new Persona("Sonia", 24));
		
		String a = lista.get(0);
		System.out.println("Objeto cadena: " + a);
		
		Persona b = listaPersona.get(0);		
		System.out.println("Objeto persona: " + b.getNombre());
	}

}
