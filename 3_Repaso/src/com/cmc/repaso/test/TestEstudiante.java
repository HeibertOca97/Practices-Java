package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante est1 = new Estudiante("Karen");
		est1.calificar(8);
		
		Estudiante est2 = new Estudiante("Alisson");
		est2.calificar(7);
	}

}
