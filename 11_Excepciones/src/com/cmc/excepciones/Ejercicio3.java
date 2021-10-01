package com.cmc.excepciones;

import java.io.File;
import java.io.IOException;

public class Ejercicio3 {

	public void metodo1() {
		File file = new File("archivo.txt");
		try {
			file.createNewFile();
			
		} catch (Exception e) {
			
		}
	}

	public void metodo2() throws IOException {
		File file = new File("archivo.txt");
		file.createNewFile();
	}
	
	public void metodo3(){
		metodo2();
	}

}
