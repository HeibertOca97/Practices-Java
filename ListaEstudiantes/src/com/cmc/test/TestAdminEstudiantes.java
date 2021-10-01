package com.cmc.test;

import java.util.ArrayList;

import com.cmc.entidades.Estudiante;
import com.cmc.servicios.AdminEstudiantes;

public class TestAdminEstudiantes {
	public static void main(String[] args) {
		AdminEstudiantes admin = new AdminEstudiantes();
		//Inicializa vacio el objeto
		System.out.println("*** Datos iniciales ***");
		admin.listarEstudiantes();
		//Agregar
		admin.agregar(new Estudiante("009", "Maria", 16));
		admin.agregar(new Estudiante("010", "Karla", 17));
		admin.agregar(new Estudiante("011", "Sara", 18));
		admin.agregar(new Estudiante("012", "Raul", 19));
		admin.agregar(new Estudiante("013", "Camila", 20));
		admin.agregar(new Estudiante("014", "Marlon", 21));
		//Lista nuevamente los datos
		System.out.println("*** Listado de estudiantes ***");
		admin.listarEstudiantes();
		//Consultar usuario
		System.out.println("*** Resultado de la busqueda por Cedula ***");
		Estudiante encontrado = admin.buscar("010");
		if(encontrado != null){
			System.out.println("Encontro a: " + encontrado.getNombre()+" con Cedula N°: "+encontrado.getCedula() +" y tiene " +encontrado.getEdad()+" años de edad");			
		}else{
			System.out.println("No existe este estudiante!!");
		}
		//Consultar menores
		System.out.println("*** Resultado de la busqueda de estudiante menor edad***");
		ArrayList<Estudiante> menores = admin.buscarMenor(19);
		if(menores.size() > 0){
			for(Estudiante est3 : menores){
				System.out.println(est3.toString());
			}
		}else{
			System.out.println("No se encontraron estudiantes en ese rango de edad");
		}
	}
}
