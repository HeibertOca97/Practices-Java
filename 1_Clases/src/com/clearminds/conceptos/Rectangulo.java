package com.clearminds.conceptos;

public class Rectangulo {
	private int base;
	private int altura;
	
	public Rectangulo(int base, int altura){
		this.base = base;
		this.altura = altura;
	}
	
	public int calcularPerimetro(){
		int res = (2 * base)+(2 * altura);
		return res;
	}
	
	public int calcularArea(){
		int res = (base * altura);
		return res;
	}
}
