package com.cmc.test;

import com.cmc.entidades.Direccion;
import com.cmc.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		System.out.println("*******Option 1********");
		Estudiante est = new Estudiante("1234567890", "Karen");
		est.imprimir();
		Direccion dir = new Direccion();
		dir.setCallePrincipal("Av. Cristo del consuelo");
		dir.setCalleSecundaria("Sin nombre");
		dir.setNumero("40");
		est.setDireccion(dir);
		est.imprimir();
		System.out.println("*******Option 2********");
		
		Estudiante est2 = new Estudiante("0934567890", "Gema");
		est2.setDireccion(new Direccion("Av. Viva bonito", "Mapasingue", "25"));
		est2.imprimir();
	}

}
