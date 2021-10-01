package com.cmc.excepciones;

public class Cuenta {
	private double saldo;
	
	public void depositar(double monto) throws CheckedException {
		if(monto<0){
			throw new CheckedException("Monto es incorrecto");
		}
	}
	
	public void retirar(double monto){
		if(monto<0){
			throw new UnCheckedException("Monto es incorrecto");
		}
	}
	
}
