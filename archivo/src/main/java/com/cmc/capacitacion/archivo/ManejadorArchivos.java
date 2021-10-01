package com.cmc.capacitacion.archivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cmc.capacitacion.entidad.Persona;
import com.cmc.capacitacion.excepciones.ToxicaException;

public class ManejadorArchivos {
	private String rutaArchivo;
	private Logger logger = LogManager.getLogger(ManejadorArchivos.class);

	public ManejadorArchivos(String rutaArchivo) {
		this.rutaArchivo = rutaArchivo;
	}

	public ArrayList<Persona> leer() throws ToxicaException {
		File file = new File(rutaArchivo);
		BufferedReader br = null;
		FileReader fileReader = null;
		ArrayList<Persona> personas = new ArrayList<Persona>();
		String linea;
		String[] partes;
		
		try {
			fileReader = new FileReader(file);
			br = new BufferedReader(fileReader);
			while((linea=br.readLine()) != null){
				partes = linea.split(",");
				personas.add(new Persona(partes[0], partes[1], partes[2]));
			}
		} catch (FileNotFoundException e) {
			logger.error("No existe el archivo: ", e);
			throw new ToxicaException("No existe el archivo: " + rutaArchivo);
		} catch (IOException e) {
			logger.error("Error al leer el archivo: ", e);
			throw new ToxicaException("Error al leer el archivo: " + rutaArchivo);
		} finally{
			try {
				if(br != null){
					br.close();					
				}
			} catch (IOException e) {
				logger.error("Error al cerrar el BufferReader ",e);
			}
			try {
				if(fileReader != null){
					fileReader.close();					
				}
			} catch (IOException e) {
				logger.error("Error al cerrar el FileReader ",e);
			}
		}
			
		return personas;
	}

}
