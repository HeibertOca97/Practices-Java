package com.cmc.excepciones;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ejercicio6 {
	private static Logger logger = LogManager.getLogger(Ejercicio6.class);
	
	public static void main(String[] args) {
		Cuenta c = new Cuenta();
		try {
			String a = null;
			a.toString();
			c.depositar(-10.5);
			
		} catch (CheckedException ex) {
			System.out.println(ex.getMessage());
			logger.error("Error al depositar", ex);
		} catch (Exception ex){
			System.out.println("Sistema no disponible, contacte con XY");
			logger.error("Error no controlado al depositar", ex);
		}

	}

}
