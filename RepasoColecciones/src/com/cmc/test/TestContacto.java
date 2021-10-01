package com.cmc.test;

import com.cmc.entidades.Contacto;
import com.cmc.entidades.Telefono;

public class TestContacto {

	public static void main(String[] args) {
		Contacto contacto = new Contacto("123", "York", "Washingtong");
		contacto.agregarTelefono(new Telefono("movistar", "0987458154"));
		
		System.out.println(contacto);

	}

}
