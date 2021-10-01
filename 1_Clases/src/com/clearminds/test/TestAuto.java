package com.clearminds.test;
import com.clearminds.conceptos.Auto;

public class TestAuto {

	public static void main(String[] args) {
		Auto a1 = new Auto("Hyundai", 4500.50, 1995);
		System.out.println("Marca: " + a1.getMarca());
		System.out.println("Precio: " + a1.getPrecio());
		System.out.println("Año: " + a1.getAnio());
		System.out.println("******************");
		
		Auto a2 = new Auto(12500);
		a2.setMarca("Chevrolet");
		a2.setAnio(2010);
		System.out.println("Marca: " + a2.getMarca());
		System.out.println("Precio: " + a2.getPrecio());
		System.out.println("Año: " + a2.getAnio());
		System.out.println("******************");
		
		Auto a3 = new Auto();
		a3.setMarca("Mercedez");
		a3.setPrecio(20500.050);
		a3.setAnio(2015);
		System.out.println("Marca: " + a3.getMarca());
		System.out.println("Precio: " + a3.getPrecio());
		System.out.println("Año: " + a3.getAnio());
		
	}

}
