package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {
	
	public static void main(String[] args){
		System.out.println("*** Producto 1 ***");
		Producto p1 = new Producto("Laptop", 750);
		p1.setPrecio();
		System.out.println("Total: " + p1.calcularPrecioPromo(0.15));
		
		System.out.println("*** Producto 2 ***");
		Producto p2 = new Producto("Monitor", 200);
		p2.setPrecio();
		System.out.println("Total: " + p2.calcularPrecioPromo(0.10));
	}
	
}
