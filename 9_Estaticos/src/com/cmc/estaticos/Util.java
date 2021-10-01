package com.cmc.estaticos;

public class Util {
	private String nombre;
	private int counter;
	private static int counter2;
	
	public boolean validarRango(int valor){
		if(valor>0 &&  valor<10){
			return true;
		}
		return false;
	}
	
	public static boolean validarPositivo(int valor){
		if(valor > 0){
			return true;
		}else{
			return false;
		}
	}
	
	public void incrementar(){
		counter=counter+1;
		counter2= counter2+1;
	}
	
	public Util(String nombre){
		this.nombre = nombre;
	}
	
	public void imprimir(){
		System.out.println(nombre+" "+counter);
		System.out.println(nombre+" "+counter2);
	}
}
