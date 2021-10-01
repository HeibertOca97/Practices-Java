package com.cmc.directorio.entidades;

public class Telefono {
	private String operador;
	private String numero;
	private int codigo;
	private boolean tieneWhatsapp = false;
	
	public Telefono(String operador, String numero, int codigo) {
		this.operador = operador;
		this.numero = numero;
		this.codigo = codigo;
	}


	public void imprimir(){
		System.out.println("Operadora: "+ operador);
		System.out.println("Numero: "+ numero);
		System.out.println("Codigo: "+ codigo);
		System.out.println("Tiene Whatsapp: "+ tieneWhatsapp);
	}


	public String getOperador() {
		return operador;
	}


	public void setTieneWhatsapp(boolean tieneWhatsapp) {
		this.tieneWhatsapp = tieneWhatsapp;
	}

	public boolean isTieneWhatsapp() {
		return tieneWhatsapp;
	}
	
	
	
	
}
