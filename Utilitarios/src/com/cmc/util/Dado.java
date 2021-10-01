package com.cmc.util;

public class Dado {
	
	public static int lanzar(){
		double d = Math.random();
		//convertir un double a int - hay que castear el valor
		int valor = (int)(d*6);
		return valor+1;
	}

}
