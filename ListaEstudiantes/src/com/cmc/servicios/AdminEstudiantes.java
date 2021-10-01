package com.cmc.servicios;

import java.util.ArrayList;

import com.cmc.entidades.Estudiante;

public class AdminEstudiantes {
	private ArrayList<Estudiante> estudiantes;
	
	public AdminEstudiantes(){
		estudiantes = new ArrayList<Estudiante>();
	}
	
	public void agregar(Estudiante estudiante){
		estudiantes.add(estudiante);
	}
	
	public Estudiante buscar(String cedula){
		//Enhanced for
		for(Estudiante est : estudiantes){
			if(cedula.equals(est.getCedula())){
				return est;
			}
		}
		return null;
	}
	
	public ArrayList<Estudiante> buscarMenor(int edad){
		ArrayList<Estudiante> menores = new ArrayList<Estudiante>();
		
		for(Estudiante est : estudiantes){
			if(est.getEdad() < edad){
				menores.add(est);
			}
		}
		
		return menores;
	}
	
	public void listarEstudiantes(){
		if(estudiantes.size() > 0){
			for(Estudiante est : estudiantes){
				System.out.println(est.toString());
			}			
		}else{
			System.out.println("Por el momento no hay registros");
		}
	}
}
