package com.cmc.juegos;

import com.cmc.util.Dado;

public class TestJuego {

	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			System.out.println(Dado.lanzar());
		}
	}

}
