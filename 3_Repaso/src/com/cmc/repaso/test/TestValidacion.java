package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion val = new Validacion();
		System.out.println("Resultado del monto: " + val.validarMonto(-1));
		System.out.println("Resultado del monto: " + val.validarMonto(0));
		System.out.println("Resultado del monto: " + val.validarMonto(1));
	}

}
