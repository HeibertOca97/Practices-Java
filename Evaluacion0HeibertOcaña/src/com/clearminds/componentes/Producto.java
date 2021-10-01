package com.clearminds.componentes;

public class Producto {
	private String nombre;
	private String codigo;
	private double precio;
	
	public Producto(String codigo, String nombre, double precio) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	}

	public void incrementarPrecio(int impuesto){
		double porcentaje = (this.precio * impuesto) / 100;
		this.precio = this.precio + porcentaje;
	}
	
	public void disminuirPrecio(double descuento){
		this.precio = this.precio - descuento;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	
}
