package com.cmc.flujo.test;

import com.cmc.flujo.Validador;

public class TestValidador {

	public static void main(String[] args) {
		Validador validador = new Validador();
		validador.validarEdad(20);
		validador.validarEdad(18);
		validador.validarEdad(15);
		System.out.println("*********");
		/*
		System.out.println(validador.validarEdadMsg(20));
		System.out.println(validador.validarEdadMsg(18));
		System.out.println(validador.validarEdadMsg(15));
		System.out.println("*********");
		
		System.out.println("Es mayor de edad: "+validador.esMayorDeEdad(18));
		System.out.println("Es mayor de edad: "+validador.esMayorDeEdad(15));
		*/
	}

}
