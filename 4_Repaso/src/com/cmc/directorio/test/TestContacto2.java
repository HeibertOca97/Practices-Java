package com.cmc.directorio.test;

import com.cmc.directorio.admin.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto2 {

	public static void main(String[] args) {
		//Contacto 1
		Telefono telf1 = new Telefono("movi", "0984874512", 10);
		Contacto c1 = new Contacto("Maria", "Panda", telf1, 70);
		//Contacto 1
		Telefono telf2 = new Telefono("movi", "0979854214", 10);
		Contacto c2 = new Contacto("Josselym", "Gorila", telf2, 60.57);
		
		//Comparaciones
		AdminContactos ac1 = new AdminContactos(); 
		System.out.println("***** CONTACTO *****");
		//El mas pesado
		Contacto r_pesado1 = ac1.buscarMasPesado(c1, c2);
		if(r_pesado1 != null){
			r_pesado1.imprimir();			
		}else{
			System.out.println("Ambos tienen el mismo peso de "+ c2.getPeso());
		}
		//Operadoras
		boolean r_comparacion = ac1.compararOperadoras(c1, c2);
		System.out.println("Son de la misma operadora: "+ r_comparacion);
		
	}

}
