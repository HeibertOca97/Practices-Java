package com.cmc.excepciones;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("INICIO");
		
		try{
			System.out.println("Habre conexion DB");
			String a = "abcdefg";
			a.substring(1, 3);			
		}catch(Exception e){
			System.out.println("Entra al catch");
		}finally{
			System.out.println("Cierra conexion DB");
		}
		
		System.out.println("FIN");

	}

}
