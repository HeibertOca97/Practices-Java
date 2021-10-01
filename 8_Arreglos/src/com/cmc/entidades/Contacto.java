package com.cmc.entidades;

public class Contacto {
	private String codigo;
	private String nombre;
	
	public Contacto(String codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Contacto [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
	
	
	
}
