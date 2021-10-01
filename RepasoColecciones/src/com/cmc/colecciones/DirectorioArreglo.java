package com.cmc.colecciones;

import java.util.ArrayList;
import java.util.HashMap;

import com.cmc.entidades.Contacto;

public class DirectorioArreglo extends Directorio {

	private Contacto[] contactos;
	private int numeroDeElementos;
	private int elementosEliminados;

	public DirectorioArreglo() {
		contactos = new Contacto[10];
	}

	public void agregarContacto(Contacto contacto) {
		if (numeroDeElementos < contactos.length) {
			contactos[numeroDeElementos] = contacto;
			numeroDeElementos++;
		}
	}

	public Contacto buscarContacto(String cedula) {
		Contacto contactoEncontrado;
		for (int i = 0; i < contactos.length; i++) {
			contactoEncontrado = contactos[i];
			if (cedula.equals(contactoEncontrado.getCedula())) {
				return contactoEncontrado;
			}
		}
		return null;
	}

	// Revisar este metodo
	public Contacto eliminarContacto(String cedula) {
		Contacto nuevaLista;
		if (contactos.length > 0) {
			for (int i = 0; i < contactos.length; i++) {
				nuevaLista = contactos[i];
				if (cedula.equals(nuevaLista.getCedula())) {
					return nuevaLista;
				}
			}
			
		}
		
		return null;
	}

	public void imprimir() {
		if (contactos.length > 0) {
			for (int i = 0; i < contactos.length; i++) {
				if (contactos[i] != null) {
					System.out.println(contactos[i].toString());
				}
			}
		} else {
			System.out.println("Por el momento no hay ningun dato");
		}
	}

}
