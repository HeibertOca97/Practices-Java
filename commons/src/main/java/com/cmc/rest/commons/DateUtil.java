package com.cmc.rest.commons;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static String convertir(Date date) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return formato.format(date);
	}
	
	public static Date convertirDate(String stringDate) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date fecha = null;
		try {
			fecha = formato.parse(stringDate);
		} catch (ParseException e) {
			System.out.println("Ha ocurrido un error al convertir la fecha");
			e.printStackTrace();
		}
		return fecha;
	}
	
	public static String convertirString(Date date){
		SimpleDateFormat formato = new SimpleDateFormat("MM/dd/yyyy");
		String fechaFormateada = formato.format(date);
		return fechaFormateada;
	}
}
