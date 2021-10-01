package com.clearminds.test;

import com.clearminds.componentes.MaquinaDulces;
import com.clearminds.componentes.Producto;

public class TestVender {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda("A1");
		maquina.agregarCelda("B1");
		maquina.agregarCelda("C1");
		maquina.agregarCelda("D1");
		System.out.println("*** Primera venta ***");
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		System.out.println("*** Productos iniciales ***");
		maquina.mostrarProductos();
		System.out.println("*** Productos finales ***");
		maquina.vender("B1");
		
		System.out.println("*** Segunda venta ***");
		Producto producto2=new Producto("D456","Doritos",0.70);
		maquina.cargarProducto(producto2, "A1", 6);
		System.out.println("*** Productos iniciales ***");
		maquina.mostrarProductos();
		System.out.println("*** Productos finales ***");
		maquina.vender("A1");
		
		

	}

}
