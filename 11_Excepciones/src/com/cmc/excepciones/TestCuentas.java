package com.cmc.excepciones;

public class TestCuentas {

	public static void main(String[] args) {
		Cuenta c = new Cuenta();
		//c.depositar(10.5);
		try {
			c.retirar(-100);			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
