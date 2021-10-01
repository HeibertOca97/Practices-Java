package com.cmc.flujo;

public class Validador {
	
	public void validarEdad(int edad){
		if(edad > 18){
			System.out.println("Es mayor de edad");
		}else if(edad < 18){
			System.out.println("Es menor de edad");
		}else{
			System.out.println("Su edad 18");
		}
	}
	
	public String validarEdadMsg(int edad){
		if(edad>18){
			return "Es mayor de edad";
		}else if(edad == 18){
			return "Tiene 18 años";
		}else{
			return "Es menor de edad";
		}
	}
	
	public boolean esMayorDeEdad(int edad){
		if(edad>=18){
			return true;
		}else{
			return false;
		}
	}
}
