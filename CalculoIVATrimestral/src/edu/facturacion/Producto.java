package edu.facturacion;

public class Producto {

	private double importe;
	private String descripcion;
	private Iva Iva;
	
	public enum Iva {
		SUPERREDUCIDO("Superreducido", 0.04), REDUCIDO("Reducido", 0.1), NORMAL("Normal", 0.21);
		
		private double valor;
		private String tipo;
		
		Iva (String tipo, double valor){
			this.valor = valor;
			this.tipo = tipo;
		}
		
		public double getValor() {
			return valor;
		}
		
		public String getTipo() {
			return tipo;
		}
		
	}
	
	
	public Producto(String descripcion, double importe, Iva iva) {
			
		this.descripcion = descripcion;
		this.importe = importe;
		this.Iva = iva;
	}
	
	public double getImporte() {
		return importe;
	}


	public void setImporte(double importe) {
		this.importe = importe;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	@Override
	public String toString() {
		return "Producto [descripcion = " + descripcion + ", importe = " + importe + ", IVA = " + Iva + " ]";
	}
	

}
