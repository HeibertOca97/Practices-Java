package com.cmc.estaticos;

public class Vehiculo {
	private boolean estado = false;
	private int aceleracion = 0;
	private int marcha;
	private int gasolina;
	
	private final int TANQUE = 15;
	private final int TOPE = 200;
	
	public Vehiculo(int litros){
		gasolina = litros;
		if(gasolina > 0 && gasolina <= TANQUE){
			estado = true;
		}else{
			estado = false;
		}
	}
	
	public void encender(){
		if(estado){
			aceleracion = 10;
			System.out.println("El vehiculo ha sido encendido");
		}else{
			System.out.println("El vehiculo no puede encender revise su estado");
		}
	}
	
	public void apagar(){
		if(estado){
			if(aceleracion < 11){
				aceleracion = 0;
				System.out.println("El vehiculo ha sido apagado");				
			}else{
				System.out.println("No se puede apagar un vehiculo en movimiento");
			}
		}
	}
	
	public void ingresarCambioEn(int valor){
		if(estado){
			marcha = valor;
			if(marcha > 0 && marcha < 7){
				int variante = TOPE / 6;
				aceleracion = marcha;
				if(aceleracion <= TOPE){
					aceleracion = aceleracion * variante;
					System.out.println("Vehiculo corriendo a: "+ aceleracion+"km");				
				}			
			}else{
				aceleracion = 10;
				System.out.println("El vehiculo ha parado");
			}
		}
	}
	
	public void estado(){
		System.out.println("Espacio maximo del tanque "+TANQUE+" litros");
		System.out.println("Tanque: "+gasolina+" litros");
		System.out.println("Estado: "+estado);
		System.out.println("Cambio: "+ marcha);
		System.out.println("Aceleracion: "+ aceleracion);		
	}
	
}
