package com.cmc.admin;

import com.cmc.entidades.Producto;

public class AdminProducto {
	
	//Comparar recibe 2 parametros de tipo Producto
	//Compara los precios de los productos
	//Retorna el Producto de Mayor Valor
	
	public Producto obtenerProductoMasCaro(Producto a, Producto b){
		if(a.getPrecio() > b.getPrecio()){
			return a;
		}else if(a.getPrecio() < b.getPrecio()){
			return b;
		}else{			
			return null;
		}
	}
}
