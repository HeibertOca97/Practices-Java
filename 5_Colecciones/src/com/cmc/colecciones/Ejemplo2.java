package com.cmc.colecciones;

import java.util.ArrayList;

public class Ejemplo2 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("a");
		lista.add("b");
		lista.add("c");
		
		String a = lista.get(1);
		System.out.println("Valor: " + a);
		
		int tamanio = lista.size();
		System.out.println("Tamaño: "+tamanio);
		
		String cadena = null;
		for(int i = 0; i < lista.size(); i++){
			cadena = lista.get(i);
			System.out.println("Valor: "+ cadena);
		}
		
		
		
		
	}

}
