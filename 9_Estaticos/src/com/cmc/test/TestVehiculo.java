package com.cmc.test;

import com.cmc.estaticos.Vehiculo;

public class TestVehiculo {

	public static void main(String[] args) {
		Vehiculo v1 = new Vehiculo(10);
		v1.encender();
		v1.ingresarCambioEn(5); // valores 1 - 6
		//v1.apagar();//EL vehiculo debe esta detenido
		//v1.ingresarCambioEn(0); // Si el valor es menor 1 y mayor a 6 el vehiculo se lo considera detenido 
		//v1.apagar();
		System.out.println("***** ESTADO *****");
		v1.estado();
	}

}
