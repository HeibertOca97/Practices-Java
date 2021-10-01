package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		System.out.println("***PRODUCTOS***");
		System.out.println("*** 1 ***");
		Item p1 = new Item();
		System.out.println("***CANTIDAD INICIAL***");
		p1.setPa(20);
		p1.imprimir();
		//ventas
		p1.vender(5);
		p1.vender(5);
		//devoluciones
		p1.devolver(4);
		p1.devolver(2);
		System.out.println("***RESULTADO***");
		p1.imprimir();
		
		System.out.println("");
		
		System.out.println("*** 2 ***");
		Item p2 = new Item();
		System.out.println("***CANTIDAD INICIAL***");
		p2.setPa(50);
		p2.imprimir();
		//ventas
		p2.vender(15);
		p2.vender(5);
		//devoluciones
		p2.devolver(4);
		p2.devolver(7);
		System.out.println("***RESULTADO***");
		p2.imprimir();

	}

}
