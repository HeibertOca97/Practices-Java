package com.cmc.commons.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	private final static String PATRON = "yyyy/MM/dd";
	
	public static Date convertir(String date) throws ParseException{
		SimpleDateFormat formato = new SimpleDateFormat(PATRON);
		Date nuevoFormato = null;
		nuevoFormato = formato.parse(date);
		return nuevoFormato;
	} 
}