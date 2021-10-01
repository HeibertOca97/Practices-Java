package com.clearminds.test;
import com.clearminds.entidades.Persona;

public class TestPersona {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Heibert");
		//Imprimir mensaje por consola
		System.out.println("Nombre: "+ p1.getNombre());
		System.out.println("Edad: "+ p1.getEdad());
		System.out.println("Estatura: " + p1.getEstatura());
		System.out.println("******************");
		
		Persona p2 = new Persona("Joseph");
		p2.setEdad(24);
		p2.setEstatura(1.65);
		//Imprimir mensaje por consola
		System.out.println("Nombre: "+ p2.getNombre());
		System.out.println("Edad: "+ p2.getEdad());
		System.out.println("Estatura: " + p2.getEstatura());
		System.out.println("******************");
		
		Persona p3 = new Persona();
		System.out.println("Nombre: "+ p3.getNombre());
		System.out.println("Edad: "+ p3.getEdad());
		System.out.println("Estatura: " + p3.getEstatura());
		System.out.println("******************");
		
		Persona p4 = new Persona("Master", 25, 170);
		//Imprimir mensaje por consola
		System.out.println("Nombre: "+ p4.getNombre());
		System.out.println("Edad: "+ p4.getEdad());
		System.out.println("Estatura: " + p4.getEstatura());
		
	}

}
