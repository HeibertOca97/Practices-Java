package com.cmc.test;

import com.cmc.entidades.Cliente;
import com.cmc.mapas.AdminClientes;

public class TestAdminClientes {

	public static void main(String[] args) {
		AdminClientes admin = new AdminClientes();
		//Agregar
		admin.agregarCliente(new Cliente("12345", "Gabil"));
		admin.agregarCliente(new Cliente("12543", "Benimaru"));
		admin.agregarCliente(new Cliente("54321", "Shion"));
		admin.agregarCliente(new Cliente("54123", "Shuna"));
		admin.agregarCliente(new Cliente("54312", "Hakurou"));
		admin.agregarCliente(new Cliente("54231", "Souei"));

		//Recuperar
		Cliente clienteEncontrado = admin.recuperar("12543");
		System.out.println("# Resultado de consulta");
		if (clienteEncontrado != null) {
			System.out.println("Cliente [Nombre: " + clienteEncontrado.getNombre() + ", Cedula: " + clienteEncontrado.getNombre()+"]");
		}else{
			System.out.println("No se encontro resultados de este cliente.");
		}
		System.out.println("");
		System.out.println("Total de clientes almacenados: " + admin.totalDeRegistrados());
		System.out.println("");
		System.out.println("# Formas de Iterar un HashMap");
		System.out.println("");
		System.out.println("*** Formas 1 ***");
		admin.listarClientes1();
		System.out.println("");
		System.out.println("*** Formas 2 ***");
		admin.listarClientes2();
		System.out.println("");
		System.out.println("*** Formas 3 ***");
		admin.listarClientes3();
		System.out.println("");
		System.out.println("*** Formas 4 ***");
		admin.listarClientes4();
	}

}
