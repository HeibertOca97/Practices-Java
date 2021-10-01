package com.cmc.directorio.test;

import com.cmc.directorio.admin.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		System.out.println("***** Estado inicial *****");
		Telefono telf1 = new Telefono("claro", "0985623561", 10); 
		Contacto c1 = new Contacto("Joseph", "Garces", telf1, 65.70);
		
		c1.imprimir();
		System.out.println("Estado del usuario: " + c1.isActivo());
		
		System.out.println("***** Estado actualizado *****");
		//Whatsapp
		telf1.setTieneWhatsapp(true);
		//Activar usuario
		AdminContactos ac1 = new AdminContactos();
		ac1.activarUsuario(c1);
		c1.imprimir();
		System.out.println("Estado del usuario: " + c1.isActivo());
	}

}
