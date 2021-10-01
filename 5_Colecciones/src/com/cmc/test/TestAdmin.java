package com.cmc.test;

import java.util.ArrayList;

import com.cmc.colecciones.AdminPersona;
import com.cmc.entidades.Persona;

public class TestAdmin {

	public static void main(String[] args) {
		AdminPersona admin = new AdminPersona();
		
		admin.agregar(new Persona("Manrique", 16));
		admin.agregar(new Persona("Shakira", 17));
		admin.agregar(new Persona("Byron", 19));
		admin.agregar(new Persona("Karol", 19));
		admin.agregar(new Persona("Josei", 20));
		admin.agregar(new Persona("Heibert", 24));
		//admin.imprimir();
		
		System.out.println("*** Buscar por nombre ***");
		Persona a = admin.buscar("Heibert");
		if(a != null){
			System.out.println("Persona: " + a.getNombre());			
		}else{
			System.out.println("No existe esta persona!!");
		}
		
		System.out.println("*** Buscar por edad ***");
		Persona b = admin.buscarPorEdad(18);
		if(b != null){
			System.out.println("Persona: " + b.getNombre());			
		}else{
			System.out.println("No existe esta persona!!");
		}
		
		System.out.println("*** Buscar mayores ***");
		ArrayList<Persona> pm = admin.buscarMayores(19);
		System.out.println("Total: "+pm.size());
		for (int i = 0; i < pm.size(); i++) {
			System.out.println("Persona index: "+i+" | Nombre: "+pm.get(i).getNombre());
		}
	}

}
