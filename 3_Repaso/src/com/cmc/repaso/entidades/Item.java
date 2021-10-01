package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int pa;
	private int pd;
	private int pv;
	
	public void imprimir(){
		System.out.println("Productos actuales: " + this.pa);
		System.out.println("Productos vendidos: " + this.pv);
		System.out.println("Productos devueltos: " + this.pd);
	}
	
	public void vender(int pv){
		this.pa = this.pa - pv;
		this.pv = this.pv + pv;
	}
	
	public void devolver(int pv){
		this.pa = this.pa + pv;
		this.pv = this.pv - pv;
		this.pd = this.pd + pv;
	}

	public void setPa(int pa) {
		this.pa = pa;
	}
	
	
}
