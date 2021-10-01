package com.cmc.evaluacion.fase2.entidades;

import java.util.ArrayList;
import java.util.HashMap;

public class Cartera {
	private HashMap<String, ArrayList<Pago>> pagos;
	private ArrayList<Cliente> clientes;
	private ArrayList<Pago> valores = new ArrayList<Pago>();
	private ArrayList<Balance> balances = new ArrayList<Balance>();

	public Cartera() {
		clientes = new ArrayList<Cliente>();
		pagos = new HashMap<String, ArrayList<Pago>>();
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public boolean agregarCliente(Cliente cliente) {
		Cliente clienteEncontrado = this.buscarCliente(cliente.getCedula());
		if (clienteEncontrado == null) {
			this.clientes.add(cliente);
			return true;
		} else {
			return false;
		}
	}

	public Cliente buscarCliente(String cedula) {

		for (Cliente cliente : this.clientes) {
			if (cliente.getCedula().equals(cedula)) {
				return cliente;
			}
		}

		return null;
	}

	public void colocarPrestamo(Prestamo prestamo) {
		Cliente clienteRecuperado = this.buscarCliente(prestamo.getCedulaCliente());
		if (clienteRecuperado != null) {
			clienteRecuperado.agregarPrestamo(prestamo);
		}
	}

	public void agregarPago(Pago pago) {
		if (!pagos.containsKey(pago.getNumeroPrestamo())) {
			valores.add(pago);
			pagos.put(pago.getNumeroPrestamo(), valores);

		} else if (pagos.containsKey(pago.getNumeroPrestamo())) {
			valores.add(pago);
		}
	}

	public ArrayList<Pago> consultarPagos(String codigoPrestamo) {
		ArrayList<Pago> listaPagos = null;

		if (pagos.containsKey(codigoPrestamo)) {
			listaPagos = pagos.get(codigoPrestamo);
		}

		return listaPagos;
	}

	public ArrayList<Balance> calcularBalances() {
		ArrayList<Balance> aPrestamo = new ArrayList<Balance>();
		Balance blc;
		double valoresAdeudados = 0;
		double pagosRealizados = 0;
		double saldo = 0;
		for (int i = 0; i < clientes.size(); i++) {
			blc = new Balance();
			blc.setNumeroCedula(clientes.get(i).getCedula());
			for (int j = 0; j < clientes.get(i).getPrestamos().size(); j++) {
				valoresAdeudados = valoresAdeudados + clientes.get(i).getPrestamos().get(j).getMonto();
				blc.setValorPrestamo(valoresAdeudados);
				for (int j2 = 0; j2 < pagos.get(clientes.get(i).getPrestamos().get(j).getNumero()).size(); j2++) {
					pagosRealizados = pagos.get(clientes.get(i).getPrestamos().get(j).getNumero()).get(j2).getMonto();
					blc.setValorPagado(pagosRealizados);
				}
			}
			saldo = blc.getValorPrestamo() - blc.getValorPagado();
			blc.setSaldo(saldo);
			aPrestamo.add(blc);
		}
		
		return aPrestamo;
	}

}