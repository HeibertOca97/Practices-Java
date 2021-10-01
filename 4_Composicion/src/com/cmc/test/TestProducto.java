package com.cmc.test;

import com.cmc.admin.AdminProducto;
import com.cmc.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		AdminProducto admin = new AdminProducto();
		//Producto #1
		Producto pr1 = new Producto("Papas", 1);
		//Producto #2
		Producto pr2 = new Producto("Leche", 12);
		
		Producto prodCaro = admin.obtenerProductoMasCaro(pr1, pr2);
		
		if(prodCaro == null){
			System.out.println("Ambos productos tienen el mismo precio");
		}else{
			System.out.println("Producto mas caro");
			System.out.println("Nombre: "+prodCaro.getNombre());
			System.out.println("Precio: "+prodCaro.getPrecio());
		}
	}

}
