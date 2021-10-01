package com.cmc.test;

import com.cmc.entidades.Contacto;

public class TestContactos {

	public static void main(String[] args) {
		Contacto [] contactos = new Contacto[10];
		
		contactos[0] = new Contacto("123", "Juan");
		contactos[1] = new Contacto("125", "Diego");
		contactos[2] = new Contacto("145", "Sandro");

		Contacto n = contactos[0];
		//System.out.println(n);
		
		Contacto contacto = null;
		
		for (int i = 0; i < contactos.length; i++) {
			contacto = contactos[i];
			System.out.println(contacto);
		}
	}

}
