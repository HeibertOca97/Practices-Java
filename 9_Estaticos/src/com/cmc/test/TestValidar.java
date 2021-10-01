package com.cmc.test;

import com.cmc.estaticos.Util;

public class TestValidar {

	public static void main(String[] args) {
		Util util = new Util("0");
		boolean r= util.validarRango(9);
		System.out.println(r);
		
		boolean r2 = Util.validarPositivo(-1);
		System.out.println(r2);
		
		Util u1 = new Util("Carro");
		u1.incrementar();
		u1.imprimir();
		Util u2 = new Util("Moto");
		u2.incrementar();
		u2.imprimir();
	}

}
