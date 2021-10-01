package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Contacto;

public class DirectorioLista extends Directorio {
	
	private ArrayList<Contacto> contactos;
	
	public DirectorioLista() {
		contactos = new ArrayList<Contacto>();
	}

	public void agregarContacto(Contacto contacto){
		contactos.add(contacto);
	}
	
	public Contacto buscarContacto(String cedula){
		for(Contacto contacto : contactos){
			if(cedula.equals(contacto.getCedula())){
				return contacto;
			}
		}
		return null;
	}
	
	public Contacto eliminarContacto(String cedula){
		ArrayList<Contacto> eliminado = new ArrayList<Contacto>();
		Contacto res = null;
		if(contactos.size()>0){
			for (int i = 0; i < contactos.size(); i++) {
				res = contactos.get(i);
				if(cedula.equals(res.getCedula())){
					eliminado.add(res);
					contactos.remove(i);
				}
			}
			if(eliminado.size() > 0){
				res = eliminado.get(0);				
				return res;
			}
		}
		return null;
	}
	
	public void imprimir(){
		if(contactos.size() > 0){
			for(Contacto contacto : contactos){
				System.out.println(contacto.toString());
			}
		}else{
			System.out.println("Por el momento no hay ningun dato");			
		}
	}
}
