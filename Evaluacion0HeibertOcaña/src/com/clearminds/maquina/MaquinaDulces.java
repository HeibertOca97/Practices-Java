package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public void configurarMaquina(String codigo1, String codigo2, String codigo3, String codigo4) {
		this.celda1 = new Celda(codigo1);
		this.celda2 = new Celda(codigo2);
		this.celda3 = new Celda(codigo3);
		this.celda4 = new Celda(codigo4);
	}

	public void mostrarConfiguracion() {
		System.out.println("CELDA 1: " + celda1.getCodigo());
		System.out.println("CELDA 2: " + celda2.getCodigo());
		System.out.println("CELDA 3: " + celda3.getCodigo());
		System.out.println("CELDA 4: " + celda4.getCodigo());
	}

	public Celda buscarCelda(String codigoCelda) {
		Celda result = null;
		Celda items[] = { celda1, celda2, celda3, celda4 };
		
		for (int i = 0; i < items.length; i++) {
			result = items[i];
			if (result.getCodigo().equals(codigoCelda)) {
				return result;
			}
		}

		return null;
	}

	public void cargarProducto(Producto producto, String codigoCelda, int stock) {
		Celda celdaRecuperada = this.buscarCelda(codigoCelda);
		celdaRecuperada.ingresarProducto(producto, stock);
	}

	public void mostrarProductos() {
		Celda items[] = { celda1, celda2, celda3, celda4 };
		for (int i = 0; i < items.length; i++) {
			System.out.println("***********CELDA " + items[i].getCodigo());
			System.out.println("Stock: " + items[i].getStock());
			if (items[i].getProducto() != null) {
				System.out.println("Nombre del Producto: " + items[i].getProducto().getNombre());
				System.out.println("Precio del Producto: " + items[i].getProducto().getPrecio());
				System.out.println("Codigo del Producto: " + items[i].getProducto().getCodigo());
			} else {
				System.out.println("La celda no tiene producto!!!");
			}
		}
		System.out.println("Saldo: " + this.saldo);
	}

	public Producto buscarProductoEnCelda(String codigoCelda) {
		Celda items[] = { celda1, celda2, celda3, celda4 };
		Producto producto = null;

		for (int i = 0; i < items.length; i++) {
			if (codigoCelda.equals(items[i].getCodigo())) {
				producto = items[i].getProducto();
			}
		}

		return producto;
	}

	public double consultarPrecio(String codigoCelda) {
		double result = 0;
		Celda items[] = { celda1, celda2, celda3, celda4 };
		for (int i = 0; i < items.length; i++) {
			if (items[i].getCodigo() == codigoCelda) {
				result = items[i].getProducto().getPrecio();
			}
		}
		return result;
	}

	public Celda buscarCeldaProducto(String codigoProducto) {
		Celda items[] = { this.celda1, this.celda2, this.celda3, this.celda4 };
		Celda result = null;
		
		for (int i = 0; i < items.length; i++) {
			if(items[i].getProducto() != null){
				if (codigoProducto.equals(items[i].getProducto().getCodigo())) {
					result = items[i];
				}				
			}
		}
		
		return result;
	}

	public void incrementarProductos(String codigo, int stock) {
		Celda celdaEncontrada = this.buscarCeldaProducto(codigo);
		celdaEncontrada.setStock(stock);
	}

	public void vender(String codigoCelda) {
		Celda celdaEncontrada = this.buscarCelda(codigoCelda);
		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
		this.setSaldo(celdaEncontrada.getProducto().getPrecio() + this.saldo);
		this.mostrarProductos();
	}

	public double venderConCambio(String codigoCelda, int stock) {
		Celda celdaEncontrada = this.buscarCelda(codigoCelda);
		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
		this.setSaldo(celdaEncontrada.getProducto().getPrecio() + this.saldo);
		return (celdaEncontrada.getStock() - stock) - celdaEncontrada.getProducto().getPrecio();
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
