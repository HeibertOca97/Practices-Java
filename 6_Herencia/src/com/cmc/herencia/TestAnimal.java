package com.cmc.herencia;

public class TestAnimal {

	public static void main(String[] args) {
		Perro perro = new Perro();
		perro.dormir();
		perro.ladrar();
		System.out.println(perro.hashCode());
		
	}

}
//LA CLASE OBJECT ES EL PADRE DE TODA LAS CLASES EN JAVA