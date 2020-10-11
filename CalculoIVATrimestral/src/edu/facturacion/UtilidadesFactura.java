package edu.facturacion;

import java.util.*;

import edu.facturacion.Producto.Iva;


public class UtilidadesFactura {

	
		
	public double calcularImporteFactura(double totalFacturaSinIVA, double importe) {
		
		
		
		return totalFacturaSinIVA;		
	}
	
	
	public double calcularIVAFactura(double totalIVA, double Iva) {
		
		
		
		return totalIVA;
	}
	
	
	public double calcularImporteFacturaTotalConIVA(double importeTotalConIVA, double totalFacturaSinIVA, double totalIVA) {
		
		
		
		return importeTotalConIVA;
	}
	
	
	public static void main(String[] args) {		
		
		Producto uno = new Producto("Leche", 0.75, Iva.NORMAL);
		Producto dos = new Producto("Pan", 0.50, Iva.REDUCIDO);
		Producto tres = new Producto("Salmon", 8.99, Iva.SUPERREDUCIDO);
		Producto cuatro = new Producto("Aguacates", 2.95, Iva.NORMAL);
		Producto cinco = new Producto("Friegasuelos", 1.20, Iva.SUPERREDUCIDO);
		Producto seis = new Producto("Cerveza", 0.56, Iva.NORMAL);
		Producto siete = new Producto("Sandia", 1.45, Iva.REDUCIDO);
		
		ArrayList <Producto> factura = new ArrayList <Producto>();
		ArrayList <Factura> facturas = new ArrayList <Factura>();
		Date fecha = new Date();
		
		
		factura.add(uno);
		factura.add(dos);
		factura.add(tres);
		factura.add(cuatro);
		factura.add(cinco);
		factura.add(seis);
		factura.add(siete);
				
		for (int x=1; x<6; x++) {
					
			Factura unaFactura = new Factura(x, factura, fecha);
			facturas.add(unaFactura);			
		}
		
		System.out.println(facturas);
		
		
		
	}
	

}
