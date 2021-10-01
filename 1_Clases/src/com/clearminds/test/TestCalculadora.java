package com.clearminds.test;

import com.clearminds.conceptos.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora op = new Calculadora();
		
		double suma = op.sumar(5.5, 5);
		double resta = op.restar(10.8, 5);
		double multiplicacion = op.multiplicar(5, 5.5);
		int dividir = op.dividir(50, 5);
		
		System.out.println("*** Resultados ***");
		System.out.println("Suma: "+ suma);
		System.out.println("Resta: "+ resta);
		System.out.println("Multiplicacion: "+ multiplicacion);
		System.out.println("Divicion: "+ dividir);
		
	}

}
