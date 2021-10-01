package com.cmc.test;

import java.util.HashMap;

import com.cmc.entidades.Cliente;

public class TestMapaClientes {

	public static void main(String[] args) {
		HashMap<String, Cliente> mapa = new HashMap<String, Cliente>();
		
		mapa.put("0854851560", new Cliente("0854851560", "Maria"));
		mapa.put("0954851560", new Cliente("0954851560", "Byron"));
		Cliente c = mapa.get("095485156");
		System.out.println(c);
		
	}

}
