package com.cmc.herencia;

public class Perro extends Animal {
	
	public void ladrar(){
		System.out.println("Perro ladrando");
	}
	//Metodo heredado
	//public void dormir(){
		//System.out.println("Animal durmiendo");
	//}
	//Sobreescritura
	public void dormir(){
		super.dormir();
		System.out.println("Perro durmiendo");
	}
	
}
