package com.clearminds.conceptos;

public class Calculadora {
		
	public double sumar(double a, double b){
		return a+b;
	}
	
	public double restar(double a, double b){
		return a - b;
	}
	
	public double multiplicar(double a, double b){
		return a * b;
	}
	
	public int dividir(int a, int b){
		if(b > 0){
		 return a / b;			
		}
		
		return 0;
	}

}
