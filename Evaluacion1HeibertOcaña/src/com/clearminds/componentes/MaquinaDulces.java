package com.clearminds.componentes;

import java.util.ArrayList;

public class MaquinaDulces {

	private ArrayList<Celda> celdas;
	private double saldo;

	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}

	public void agregarCelda(String codigo) {
		// Agregar la celda al array (Coleccion);
		celdas.add(new Celda(codigo));
	}

	public void mostrarConfiguracion() {
		Celda c = null;
		for (int i = 0; i < celdas.size(); i++) {
			c = celdas.get(i);
			System.err.println("CELDA: " + c.getCodigo());
		}
	}

	public Celda buscarCelda(String codigo) {
		Celda c1 = null;
		for (int i = 0; i < celdas.size(); i++) {
			c1 = celdas.get(i);
			if (c1.getCodigo().equals(codigo)) {
				return c1;
			}
		}
		return null;
	}

	public void cargarProducto(Producto producto, String codigoCelda, int stock) {
		Celda celdaRecuperada = this.buscarCelda(codigoCelda);
		celdaRecuperada.ingresarProducto(producto, stock);
	}

	public void mostrarProductos() {
		Celda res = null;
		for (int i = 0; i < celdas.size(); i++) {
			res = celdas.get(i);
			if(res.getProducto() != null){
				System.out.println("Celda: " + res.getCodigo() + " Stock: " + res.getStock() + " Producto: "+ res.getProducto().getNombre() + " Precio: " + res.getProducto().getPrecio());				
			}else{
				System.out.println("Celda: " + res.getCodigo() + " Stock: " + res.getStock() + " Producto: Sin producto asignado");
			}
		}
		System.out.println("Saldo: " + this.saldo);
	}
	 
	public Producto buscarProductoEnCelda(String codigoCelda){
		Producto res = null;
		
		for (int i = 0; i < celdas.size(); i++) {
			if(celdas.get(i).getProducto() != null){
				if(celdas.get(i).getCodigo().equals(codigoCelda)){
					res = celdas.get(i).getProducto();					
					return res;
				}
			}
		}
		
		return null;
	}
	
	public double consultarPrecio(String codigoCelda){
		double precio = 0;
		Celda celdaRecuperada = this.buscarCelda(codigoCelda);
		if(celdaRecuperada.getProducto() != null){
			precio = celdaRecuperada.getProducto().getPrecio();
		}
		return precio;
	}
	
	public Celda buscarCeldaProducto(String codigoProducto){
		Celda res = null;
		
		for (int i = 0; i < celdas.size(); i++) {
			if(celdas.get(i).getProducto() != null){
				if(celdas.get(i).getProducto().getCodigo().equals(codigoProducto)){
					res = celdas.get(i);					
					return res;
				}
			}
		}
		
		return null;
		
	}
	
	public void incrementarProductos(String codigoProducto, int stock){
		Celda celdaEncontrada = this.buscarCeldaProducto(codigoProducto);
		celdaEncontrada.setStock(stock);
	}
	
	public void vender(String codigoCelda){
		Celda celdaEncontrada = this.buscarCelda(codigoCelda);
		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
		this.setSaldo(celdaEncontrada.getProducto().getPrecio() + this.saldo);
		this.mostrarProductos();
	}
	
	public double venderConCambio(String codigoCelda, int stock){
		Celda celdaEncontrada = this.buscarCelda(codigoCelda);
		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
		this.setSaldo(celdaEncontrada.getProducto().getPrecio() + this.saldo);
		return (celdaEncontrada.getStock() - stock) - celdaEncontrada.getProducto().getPrecio();
	}
	
	public ArrayList<Producto> buscarMenores(double limite){
		ArrayList<Producto> productosMenores = new ArrayList<Producto>(); 
		Producto pro;
		
		for (int i = 0; i < celdas.size(); i++) {
			pro = celdas.get(i).getProducto();
			if(pro.getPrecio() <= limite){
				productosMenores.add(pro);
			}
		}
		return productosMenores;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}
	

}
