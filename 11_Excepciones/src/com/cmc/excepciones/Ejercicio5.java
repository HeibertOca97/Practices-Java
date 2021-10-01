package com.cmc.excepciones;

import java.io.File;
import java.io.IOException;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("archivo.txt");
		try {
			f.createNewFile();
			String[] a = new String[2];
			a[2] = "abc";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception ex){
			System.out.println("Error del sistema "+ ex);
		}
	}

}
