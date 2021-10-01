package com.cmc.directorio.test;

import com.cmc.directorio.admin.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		AdminTelefono at = new AdminTelefono();
		Telefono telf1 = new Telefono("claro", "0982234234", 20);
		Telefono telf2 = new Telefono("movi", "0982234234", 10);
		Telefono telf3 = new Telefono("movi", "0982234234", 10);
		
		int result = at.contarMovi(telf1, telf2, telf3);
		System.out.println("Numero de operadoras Movi: " + result);
	}

}
