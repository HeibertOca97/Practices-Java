package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telef = new Telefono("movi", "0984874512", 10);
		Contacto c = new Contacto("Maria", "play", telef, 60.57);
		c.imprimir();
	}

}
