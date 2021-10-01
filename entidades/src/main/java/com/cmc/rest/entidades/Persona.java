package com.cmc.rest.entidades;

import java.util.Date;

import com.cmc.rest.commons.DateUtil;

public class Persona {
	private String cedula;
	private String nombre;
	private String apellido;
	private String fechaCreacion;
	private String fechaNacimiento;
	private int edad;
	
	public Persona(){
		this.fechaCreacion = DateUtil.convertir(new Date());
	}
	
	public Persona(String cedula, String nombre, String apellido) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaCreacion = DateUtil.convertir(new Date());
	}

	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaCreacion="
				+ fechaCreacion + ", fechaNacimiento=" + fechaNacimiento + ", edad=" + edad + "]";
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
		
	
	
	
}