package com.clearminds.conceptos;

public class Auto {
	private String marca;
	private double precio;
	private int anio;
	
	public Auto(String marca, double precio, int anio) {
		this.marca = marca;
		this.precio = precio;
		this.anio = anio;
	}

	public Auto(double precio) {
		this.precio = precio;
	}

	public Auto() {
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	
	
	
	
}
