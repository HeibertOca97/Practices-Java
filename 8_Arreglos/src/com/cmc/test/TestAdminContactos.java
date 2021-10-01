package com.cmc.test;

import com.cmc.arreglos.AdminContactos;
import com.cmc.entidades.Contacto;

public class TestAdminContactos {
	public static void main(String[] args) {
		AdminContactos admin = new AdminContactos();
		
		admin.agregar(new Contacto("123", "Diego"));
		admin.agregar(new Contacto("143", "Mark"));
		admin.agregar(new Contacto("423", "Sasha"));
		
		admin.mostrarElementos();
	}
}
