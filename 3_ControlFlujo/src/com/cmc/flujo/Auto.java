package com.cmc.flujo;

public class Auto {
	private int cantidadGasolina;
	private int capacidadTanque;
	
	public Auto(int capacidadTanque){
		if(capacidadTanque <= 0){
			System.out.println("No se aceptan valores negativos");
		}else{
			this.capacidadTanque = capacidadTanque;
		}
		
	}
	
	public void cargarGasolina(int cantidad){
		if(this.cantidadGasolina + cantidad > this.capacidadTanque){
			System.out.println("Excede la capacidad");
		}else{
			this.cantidadGasolina = this.cantidadGasolina + cantidad;
		}			
	}

	public int getCantidadGasolina() {
		return cantidadGasolina;
	}
	
}
