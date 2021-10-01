package com.cmc.colecciones;

import java.util.ArrayList;
import java.util.HashMap;

import com.cmc.entidades.Contacto;

public class DirectorioMapa extends Directorio{
	
	private HashMap<String, Contacto> contactos;
	
	public DirectorioMapa() {
		contactos = new HashMap<String, Contacto>();
	}

	public void agregarContacto(Contacto contacto){
		contactos.put(contacto.getCedula(), contacto);
	}
	
	public Contacto buscarContacto(String cedula){
		Contacto contactoEncontrado;
		for(String key : contactos.keySet()){
			contactoEncontrado = contactos.get(key);
			if(cedula.equals(contactoEncontrado.getCedula())){
				return contactoEncontrado;
			}
		}
		return null;
	}
	
	public Contacto eliminarContacto(String cedula){
		HashMap<String, Contacto> eliminado = new HashMap<String, Contacto>(); 
		Contacto nuevaLista;
		if(contactos.size()>0){
			for (String key : contactos.keySet()) {
				nuevaLista = contactos.get(key);
				if(cedula.equals(nuevaLista.getCedula())){
					eliminado.put(nuevaLista.getCedula(), nuevaLista);
					contactos.remove(key);
				}
			}
			for(String key : eliminado.keySet()){
				nuevaLista = eliminado.get(key);				
				if(eliminado.size() > 0){
					return eliminado.get(key);
				}				
			}
		}
		return null;
	}
	
	public void imprimir(){
		if(contactos.size() > 0){
			for(String key : contactos.keySet()){
				System.out.println(contactos.get(key).toString());
			}
		}else{
			System.out.println("Por el momento no hay ningun dato");			
		}
	}
	
}
