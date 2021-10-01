package com.cmc.juego;

import com.cmc.util.Dado;

public class AdminJuego {

	private String[] manos;

	public AdminJuego() {
		manos = new String[3];
		manos[0] = "piedra";
		manos[1] = "papel";
		manos[2] = "tijera";
	}

	public void jugar() {
		int valor = Dado.lanzar();
		System.out.println(valor);
	}

	public int obtenerOpcion() {
		int valor = (int) (Math.random() * 3);
		return valor;
	}

	public void jankenpon(String valor) {
		String opcion = manos[this.obtenerOpcion()];
		if (valor.equals(opcion)) {
			System.out.println("Es un empate " + valor);
		} else {
						
		}
	}

}
