package EJERCICIO2;

public class Producto {

	private String fechaCaducidad;
	private int numeroLote;
	
	//constructors
	public Producto() {
		this.fechaCaducidad = " sin datos ";
		this.numeroLote = 0;
	}
	
	public Producto(String fechaCaducidad, int numeroLote) {
	this.fechaCaducidad = fechaCaducidad;
	this.numeroLote = numeroLote;
	}
	
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public int getNumeroLote() {
		return numeroLote;
	}
	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}

	@Override
	public String toString() {
		return "Producto [fechaCaducidad=" + fechaCaducidad + ", numeroLote=" + numeroLote + "]";
	}
	
	
	
}
