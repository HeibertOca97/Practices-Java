package com.cmc.repaso.entidades;

public class Producto {
	
	private String nombre;
	private double precio;
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public void setPrecio() {
		if(this.precio < 0){
			this.precio = -1 * precio;
		}
	}
	
	public double calcularPrecioPromo(double porcentajeDescuento){
		this.precio = this.precio - (this.precio * porcentajeDescuento);
		return this.precio;
	}
	
	
	
	

}
