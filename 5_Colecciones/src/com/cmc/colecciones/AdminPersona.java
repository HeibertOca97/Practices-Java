package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Persona;

public class AdminPersona {
	private ArrayList<Persona> personas;
	
	public AdminPersona(){
		personas = new ArrayList<Persona>(); // Solucion del atributo personas que comenzaba con valor null
	}

	public void agregar(Persona persona){
		personas.add(persona); //null.add(persona) - Solucionado
	}
	
	public void imprimir(){
		Persona per = null;
		
		for(int i = 0; i < personas.size(); i++){//null.size() - Solucionado
			per = personas.get(i);
			System.out.println("Nombre: " + per.getNombre() + " | Edad: " + per.getEdad());
		}
	}
	//Retorna una persona si el nombre coincide, caso contrario retorna null
	public Persona buscar(String nombre){
		Persona per;
		for (int i = 0; i < personas.size(); i++) {
			per = personas.get(i);
			if(per.getNombre().equals(nombre)){
				return per;
			}
		}
		return null;
	}
	
	public Persona buscarPorEdad(int edad){
		Persona per;
		for (int i = 0; i < personas.size(); i++) {
			per = personas.get(i);
			if(per.getEdad() == edad){
				return per;
			}
		}
		return null;
	}
	
	public ArrayList<Persona> buscarMayores(int edad){
		ArrayList<Persona> personasMayores = new ArrayList<Persona>();
		Persona p;
		
		for (int i = 0; i < personas.size(); i++) {
			p = personas.get(i);
			if(p.getEdad() > edad){
				personasMayores.add(p);
			}	
		}
		
		return personasMayores;
	} 
}
