package com.cmc.evaluacion.fase2.servicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cmc.commons.util.DateUtil;
import com.cmc.commons.util.TipoPrestamo;
import com.cmc.evaluacion.fase2.entidades.Cartera;
import com.cmc.evaluacion.fase2.entidades.Cliente;
import com.cmc.evaluacion.fase2.entidades.Prestamo;

public class AdminPrestamos {
	
	private static Logger logger = LogManager.getLogger(AdminPrestamos.class);

	public void colocarPrestamos(String rutaArchivo, Cartera cartera) {
		File file = new File(rutaArchivo);
		FileReader fReader = null;
		BufferedReader bReader = null;
		String lineas = "";
		try {
			fReader = new FileReader(file);
			bReader = new BufferedReader(fReader);
			while ((lineas = bReader.readLine()) != null) {
				armarPrestamo(lineas, cartera);
			}
		} catch (FileNotFoundException e) {
			logger.error("No existe el archivo en la ruta: ", e);
		} catch (IOException e) {
			logger.error("Hubo un problema al intentar leer el archivo con ruta a: ", e);
		} catch (ParseException e) {
			logger.error("Hubo un problema al momento de armar el prestamo del cliente: ", e);
		}

	}

	private static void armarPrestamo(String linea, Cartera cartera) throws ParseException{
		String[] datos;
		String cedula;
		double monto;
		String pCaracter, fecha;
		String numero;

		datos = linea.split("-");

		cedula = datos[0];
		monto = Double.parseDouble(datos[3]);
		pCaracter = datos[1].substring(0, 1);
		numero = datos[1];
		fecha = datos[2];

		Cliente recuperarCliente = cartera.buscarCliente(cedula);

		if (recuperarCliente != null) {
			Prestamo prestamo = new Prestamo(numero, cedula);
			if (TipoPrestamo.HIPOTECARIO.equals(pCaracter)) {
				prestamo.setMonto(monto);
				prestamo.setFecha(DateUtil.convertir(fecha));
				recuperarCliente.agregarPrestamo(prestamo);
			} else if (TipoPrestamo.QUIROGRAFARIO.equals(pCaracter)) {
				prestamo.setMonto(monto);
				prestamo.setFecha(DateUtil.convertir(fecha));
				recuperarCliente.agregarPrestamo(prestamo);
			} else {
				prestamo.setMonto(monto);
				prestamo.setFecha(DateUtil.convertir(fecha));
				recuperarCliente.agregarPrestamo(prestamo);
			}
		}

	}

}
