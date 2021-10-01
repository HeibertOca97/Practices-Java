package com.cmc.directorio.admin;

import com.cmc.directorio.entidades.Contacto;

public class AdminContactos {
	
	public Contacto buscarMasPesado(Contacto c1, Contacto c2){
		if(c1.getPeso() > c2.getPeso()){
			return c1;
		}else if(c1.getPeso() < c2.getPeso()){
			return c2;
		}else{
			return null;
		}
	}
	
	public boolean compararOperadoras(Contacto c1, Contacto c2){		
		if(c1.getTelefono().getOperador() == c2.getTelefono().getOperador()){
			return true;
		}else{
			return false;
		}
	}
	
	public void activarUsuario(Contacto c1){
		if(c1.getTelefono().isTieneWhatsapp()){
			c1.setActivo(true);
		}
	}
	
	
	
}
