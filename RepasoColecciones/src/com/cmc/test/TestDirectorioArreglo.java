package com.cmc.test;

import com.cmc.colecciones.DirectorioArreglo;
import com.cmc.entidades.Contacto;

public class TestDirectorioArreglo {

	public static void main(String[] args) {
		DirectorioArreglo lista = new DirectorioArreglo();
		System.out.println("*** Lista de contactos ***");
		lista.agregarContacto(new Contacto("123", "York", "Washingtong"));
		lista.agregarContacto(new Contacto("145", "Sonia", "Ochoa"));
		lista.agregarContacto(new Contacto("945", "Mickel", "Noboa"));
		
		lista.imprimir();
		
		System.out.println("*** Busqueda ***");
		Contacto encontrado = lista.buscarContacto("945");
		if(encontrado != null){
			System.out.println(encontrado);			
		}else{
			System.out.println("No existe ese contacto");
		}
		
		System.out.println("*** Eliminado ***");
		
		Contacto eliminado = lista.eliminarContacto("945");
		if(eliminado != null){
			System.out.println(eliminado);
		}else{
			System.out.println("No existe ese contacto");
		}
		System.out.println("*** Lista de contactos Actualizada ***");
		lista.imprimir();
	}

}
