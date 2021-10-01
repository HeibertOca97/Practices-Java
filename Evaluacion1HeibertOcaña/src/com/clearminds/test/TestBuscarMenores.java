package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.MaquinaDulces;
import com.clearminds.componentes.Producto;

public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		
		maquina.agregarCelda("A1");
		maquina.agregarCelda("A2");
		maquina.agregarCelda("B1");
		maquina.agregarCelda("B2");
		maquina.agregarCelda("C1");
		maquina.agregarCelda("C2");
		
		Producto pr1 = new Producto("F010", "JABON", 1.25);
		maquina.cargarProducto(pr1, "A1", 5);
		Producto pr2 = new Producto("F011", "SHAMPOO", 1.75);
		maquina.cargarProducto(pr2, "A2", 5);
		Producto pr3 = new Producto("F012", "DETERGENTE", 1);
		maquina.cargarProducto(pr3, "B1", 10);
		Producto pr4 = new Producto("F013", "CLORO", 0.50);
		maquina.cargarProducto(pr4, "B2", 10);
		Producto pr5 = new Producto("F014", "CEPILLO DE DIENTES", 1.25);
		maquina.cargarProducto(pr5, "C1", 15);
		Producto pr6 = new Producto("F015", "JAVON LIQUIDO", 1.50);
		maquina.cargarProducto(pr6, "C2", 15);
		
		Producto res;
		ArrayList<Producto> productosMenores = maquina.buscarMenores(1.5);
		System.out.println("Total consultado: " + productosMenores.size());
		
		for (int i = 0; i < productosMenores.size(); i++) {
			res = productosMenores.get(i);
			System.out.println("Producto "+ (i+1) + " | Codigo: "+res.getCodigo() + " Nombre: "+res.getNombre()+ " Precio: "+res.getPrecio());			
		}

	}

}
