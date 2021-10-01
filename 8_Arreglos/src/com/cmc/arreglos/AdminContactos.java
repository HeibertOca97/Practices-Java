package com.cmc.arreglos;

import com.cmc.entidades.Contacto;

public class AdminContactos {
	private Contacto[] contactos;
	private int elementosAgregados;
	
	public AdminContactos(){
		this.contactos = new Contacto[10];
	}
	
	public void agregar(Contacto contacto){
		if(elementosAgregados < contactos.length){
			contactos[elementosAgregados] = contacto;		
			elementosAgregados = elementosAgregados + 1;
			//elementosAgregados++;//Forma abreviada			
		}
	}
	
	public void mostrarElementos(){
		for (int i = 0; i < contactos.length; i++) {
			if(contactos[i] != null){
				System.out.println(contactos[i].toString());				
			}
		}
	}
}
