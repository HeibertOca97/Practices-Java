package com.cmc.evaluacion.fase2.servicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cmc.evaluacion.fase2.entidades.Cartera;
import com.cmc.evaluacion.fase2.entidades.Cliente;
import com.cmc.excepciones.EvaluacionException;

public class AdminClientes {
	private static Logger logger = LogManager.getLogger(AdminClientes.class);

	public static Cartera armarCartera(String rutaArchivo) throws EvaluacionException {
		Cartera cartera = new Cartera();
		File file = new File(rutaArchivo);
		FileReader fReader = null;
		BufferedReader bReader = null;
		String lineas = "";
		
		try {
			fReader = new FileReader(file);
			bReader = new BufferedReader(fReader);
			while ((lineas = bReader.readLine()) != null) {
				armarCliente(lineas, cartera);
			}
		} catch (FileNotFoundException e) {
			logger.error("No existe el archivo en la ruta: ", e);
			throw new EvaluacionException("No existe el archivo en la ruta: " + rutaArchivo);
		} catch (IOException e) {
			logger.error("Hubo un problema al intentar leer el archivo con ruta a: ", e);
			throw new EvaluacionException("Hubo un problema al intentar leer el archivo con ruta a: " + rutaArchivo);
		} finally {
			try {
				if(fReader != null){
					fReader.close();					
				}
			} catch (IOException e) {
				logger.error("Ha ocurrido un problema al cerrar el BufferReader ", e);
			}
			
			try {
				if(bReader != null){
					bReader.close();					
				}
			} catch (IOException e) {
				logger.error("Ha ocurrido un problema al cerrar el BufferReader ", e);
			}
		}

		return cartera;
	}
	
	private static void armarCliente(String linea, Cartera cartera){
		try {
			String[] datos = linea.split(",");
			cartera.agregarCliente(new Cliente(datos[0], datos[1], datos[2]));			
		} catch (Exception e) {
			logger.error("Error al armar cliente en la linea", e);
		}
	}

}