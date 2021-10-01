package com.cmc.capacitacion.test;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cmc.capacitacion.archivo.ManejadorArchivos;
import com.cmc.capacitacion.entidad.Persona;
import com.cmc.capacitacion.excepciones.ToxicaException;

public class TestManejador {
	private static Logger logger = LogManager.getLogger(TestManejador.class);
	
	public static void main(String[] args) {
		ManejadorArchivos ma = new ManejadorArchivos("C:\\Users\\Heibert\\Desktop\\personas.txt");
		
		try {
			ArrayList<Persona> person = ma.leer();
			System.out.println(person);
		} catch (ToxicaException e) {
			logger.error("No existe el archivo ",e);
			System.out.println(e.getMessage());
		} catch(Exception e){
			logger.error("El sistema esta dormido ",e);
			System.out.println("El sistema esta dormido");
		}
	}

}
