package com.cmc.rest.servicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

import com.cmc.rest.commons.ArchivoException;
import com.cmc.rest.commons.DateUtil;
import com.cmc.rest.entidades.Persona;

public class ManejadorArchivos {
	private String rutaArchivo;
	// private Logger logger = LogManager.getLogger(ManejadorArchivos.class);

	public ManejadorArchivos(String rutaArchivo) {
		this.rutaArchivo = rutaArchivo;
	}

	public ArrayList<Persona> leer() throws ArchivoException {
		File file = new File(rutaArchivo);
		BufferedReader br = null;
		FileReader fileReader = null;
		ArrayList<Persona> personas = new ArrayList<Persona>();
		String linea;
		String[] datosArray;
		Persona addPersona = null;
		try {
			// System.out.println("La ruta del fichero es: "+file.getAbsoluteFile()); //C:\apache-tomcat-9.0.52\bin
			fileReader = new FileReader(file);
			br = new BufferedReader(fileReader);
			while ((linea = br.readLine()) != null) {
				datosArray = linea.split("-");
				
				addPersona = new Persona(datosArray[2], datosArray[0], datosArray[1]);
				addPersona.setEdad(Integer.parseInt(datosArray[3]));
				addPersona.setFechaNacimiento(DateUtil.convertirString(DateUtil.convertirDate(datosArray[4])));
				personas.add(addPersona);
			}
		} catch (FileNotFoundException e) {
			// logger.error("No existe el archivo: ", e);
			System.out.println("No existe el archivo: ");
			throw new ArchivoException("No existe el archivo: " + rutaArchivo);
		} catch (IOException e) {
			// logger.error("Error al leer el archivo: ", e);
			System.out.println("Error al leer el archivo");
			throw new ArchivoException("Error al leer el archivo: " + rutaArchivo);
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				// logger.error("Error al cerrar el BufferReader ",e);
				System.out.println("Error al cerrar el Archivo \"BufferReader\"");
			}
			try {
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (IOException e) {
				System.out.println("Error al cerrar el Archivo \"FileReader\"");
				// logger.error("Error al cerrar el FileReader ",e);
			}
		}

		return personas;
	}

	public void agregarPersona(Persona persona) throws ArchivoException {
		FileWriter file = null;
		PrintWriter pw = null;
		String linea;
		try {
			file = new FileWriter(rutaArchivo, true);
			pw = new PrintWriter(file);
			linea = persona.getNombre() + "-" + persona.getApellido() + "-" + persona.getCedula() + "-" + persona.getEdad() + "-" + persona.getFechaNacimiento();
			file.append("\r\n");
			pw.print(linea);
		} catch (IOException e) {
			throw new ArchivoException("Error al encontrar el archivo");
		} finally {
			try {
				if (file != null) {
					file.close();
				}
			} catch (Exception e2) {
				System.out.println("Error al cerrar el archivo \"FileWriter\"");
			}
		}
	}

}