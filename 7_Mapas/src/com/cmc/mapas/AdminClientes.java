package com.cmc.mapas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.cmc.entidades.Cliente;

public class AdminClientes {
	private HashMap<String, Cliente> clientes;

	public AdminClientes() {
		clientes = new HashMap<String, Cliente>();
	}
	
	public void agregarCliente(Cliente cliente){
		if(!clientes.containsKey(cliente.getCedula())){
			clientes.put(cliente.getCedula(), cliente);			
		}
	}
	
	public Cliente recuperar(String cedula){
		return clientes.get(cedula);
	}
	
	public Integer totalDeRegistrados(){
		return clientes.size();
	}
	
	// Iterar a través de HashMap usando el entrySet()
	public void listarClientes1(){
		if(clientes.size() > 0){
			Iterator item =  clientes.entrySet().iterator();
			while(item.hasNext()){
				Map.Entry<String, Cliente> el = (Map.Entry)item.next();
				System.out.println("Cliente "+ el.getKey() +" [Nombre: " + el.getValue().getNombre() + ", Cedula: " + el.getValue().getCedula()+"]");
			}
		}else{
			System.out.println("Por el momento no hay ningun registro");
		}
	}
	
	// Iterar a traves de HashMap usando foreach
	public void listarClientes2(){
		if(clientes.size() > 0){
			for(Map.Entry<String, Cliente> el : clientes.entrySet()){
				System.out.println("Cliente "+ el.getKey() +" [Nombre: " + el.getValue().getNombre() + ", Cedula: " + el.getValue().getCedula()+"]");
			}
		}else{
			System.out.println("Por el momento no hay ningun registro");
		}
	}
	
	//Iterar a través de HashMap usando el método keySet()
	public void listarClientes3(){
		if(clientes.size() > 0){
			for(String key : clientes.keySet()){
				System.out.println("Cliente "+ key +" [Nombre: " + clientes.get(key).getNombre() + ", Cedula: " + clientes.get(key).getCedula()+"]");
			}
		}else{
			System.out.println("Por el momento no hay ningun registro");
		}
	}
	
	//Iterar a través de HashMap usando el método forEach()
	public void listarClientes4(){
		if(clientes.size() > 0){
			clientes.forEach((key, value)->{
				System.out.println("Cliente "+ key +" [Nombre: " + value.getNombre() + ", Cedula: " + value.getCedula()+"]");
			});
		}else{
			System.out.println("Por el momento no hay ningun registro");
		}
	}
	
}
