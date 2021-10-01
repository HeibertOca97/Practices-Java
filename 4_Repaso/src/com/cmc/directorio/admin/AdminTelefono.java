package com.cmc.directorio.admin;

import com.cmc.directorio.entidades.Telefono;

public class AdminTelefono {
	
	public void activarMensajeria(Telefono telefono){
		if(telefono.getOperador() == "movi"){
			telefono.setTieneWhatsapp(true);
		}
	}
	
	public int contarMovi(Telefono telf1, Telefono telf2, Telefono telf3){
		String array[] = {telf1.getOperador(), telf2.getOperador(), telf3.getOperador()};
		int result = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] == "movi"){
				result++;
			}			
		}
		
		return result;
	}
	
	public int contarClaro(Telefono telf1, Telefono telf2, Telefono telf3, Telefono telf4){
		String array[] = {telf1.getOperador(), telf2.getOperador(), telf3.getOperador(), telf4.getOperador()};
		int result = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] == "claro"){
				result++;
			}			
		}
		
		return result;
	}
	
}
