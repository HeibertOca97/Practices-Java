package com.cmc.directorio.entidades;

public class Contacto {
	private String nombre;
	private String apellido;
	private boolean activo;
	private Telefono telefono;
	private double peso;
	
	public Contacto(String nombre, String apellido, Telefono telefono, double peso) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.peso = peso;
	}
	
	public void imprimir(){
		System.out.println("Nombre: "+ nombre);
		System.out.println("Apellido: "+ apellido);
		System.out.println("Peso: "+ peso);
		telefono.imprimir();
	}

	public double getPeso() {
		return peso;
	}

	public Telefono getTelefono() {
		return telefono;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public boolean isActivo() {
		return activo;
	}
	
	
	
	
	
	
	
}
