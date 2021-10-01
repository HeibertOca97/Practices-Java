package com.cmc.test;

import java.util.ArrayList;
import java.util.HashMap;

public class TestMapas {

	public static void main(String[] args) {
		ArrayList<String> listas = new ArrayList<String>();
		listas.add("uno");
		String valor = listas.get(0);
		System.out.println(valor);
		
		HashMap<String, String> mapas = new HashMap<String, String>();
		mapas.put("a", "Saul");
		mapas.put("b", "Mia");
		String valor2 = mapas.get("a");
		System.out.println(valor2);
		
	}

}
