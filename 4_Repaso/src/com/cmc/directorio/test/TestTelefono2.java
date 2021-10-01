package com.cmc.directorio.test;

import com.cmc.directorio.admin.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono2 {

	public static void main(String[] args) {

		AdminTelefono at = new AdminTelefono();
		Telefono telf = new Telefono("movi", "0982234234", 20);
		at.activarMensajeria(telf);
		telf.imprimir();

	}

}
