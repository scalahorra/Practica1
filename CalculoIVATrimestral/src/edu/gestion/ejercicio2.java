package edu.gestion;

import edu.facturacion.Producto;
import edu.facturacion.Producto.Iva;

public class ejercicio2 {

	public static void main(String[] args) {		
		
		Producto uno = new Producto("Leche", 0.75, Iva.NORMAL);
		Producto dos = new Producto("Pan", 0.50, Iva.REDUCIDO);
		Producto tres = new Producto("Salmon", 8.99, Iva.SUPERREDUCIDO);
		Producto cuatro = new Producto("Aguacates", 2.95, Iva.NORMAL);
		Producto cinco = new Producto("Friegasuelos", 1.20, Iva.SUPERREDUCIDO);
		Producto seis = new Producto("Cerveza", 0.56, Iva.NORMAL); 
		Producto siete = new Producto("Sandia", 1.45, Iva.REDUCIDO);
	
		System.out.println(uno);
		System.out.println(dos);
		System.out.println(tres);
		System.out.println(cuatro);
		System.out.println(cinco);
		System.out.println(seis);
		System.out.println(siete);
		

	}

}
