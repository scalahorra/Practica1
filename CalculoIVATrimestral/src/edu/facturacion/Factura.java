package edu.facturacion;

import java.util.*;

public class Factura {

	
	private int numero;
	private ArrayList <Producto> productos;
	private Date fecha;
	

	public Factura(int numeros, ArrayList<Producto> productos, Date fecha) {
		super();
		this.numero = numeros;
		this.productos = productos;
		this.fecha = fecha;
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
	
	
	@Override
	public String toString() {
		return "Factura [numero= " + numero + ", \n\nproductos= \n" + productos + ",\n\n fecha= " + fecha + "]";
	}

}
