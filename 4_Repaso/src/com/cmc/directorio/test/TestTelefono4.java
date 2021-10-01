package com.cmc.directorio.test;

import com.cmc.directorio.admin.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		AdminTelefono at1 = new AdminTelefono();
		Telefono telf1 = new Telefono("movi", "0924874512", 10);
		Telefono telf2 = new Telefono("claro", "0964874514", 20);
		Telefono telf3 = new Telefono("claro", "0972234234", 10);
		Telefono telf4 = new Telefono("claro", "0972234234", 20);
		
		int result = at1.contarClaro(telf1, telf2, telf3, telf4);
		System.out.println("Numero de operadoras Claro: " + result);
	}

}
