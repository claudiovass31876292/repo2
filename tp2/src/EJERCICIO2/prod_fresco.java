package EJERCICIO2;

public class prod_fresco extends Producto {

	private String fechaEnvasado;
	private String paisOrigen;
	
	// constructors 
	public prod_fresco() {
		super();
	}
	public prod_fresco(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen)
	{
		super(fechaCaducidad,numeroLote);
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}
	
	//setters and getters
	public String getFechaEnvasado() {
		return fechaEnvasado;
	}
	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	//
	@Override
	public String toString() {
		return "prod_fresco [fechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen + "]";
	}
	
	
	
}
