package com.cmc.calificaciones.test;

import com.cmc.calificaciones.entidades.Estudiante;
import com.cmc.calificaciones.servicios.AdminEstudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		AdminEstudiante est = new AdminEstudiante();
		est.agregar(new Estudiante("Mickel", "Jackson"));
		System.out.println("Fin");
	}

}
