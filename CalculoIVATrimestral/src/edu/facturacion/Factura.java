package edu.facturacion;

import java.util.ArrayList;

public class Factura {

	
	private int numero;
	private ArrayList <Producto> productos;
	
	
	public Factura(int numeros, ArrayList<Producto> productos) {
		super();
		this.numero = numeros;
		this.productos = productos;
	}

	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public ArrayList<Producto> getProductos(){
		return productos;
	}
	
	public void setProductos (ArrayList<Producto> productos) {
		this.productos = productos;
	}

}
