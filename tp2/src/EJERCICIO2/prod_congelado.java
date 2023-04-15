package EJERCICIO2;

public class prod_congelado extends Producto {

	private float temp;
	
	//constructor
	public prod_congelado()
	{
		super();
	}
    
	public prod_congelado(String fechaCaducidad, int numeroLote, float temp)
	{
		super(fechaCaducidad,numeroLote);
		this.temp = temp;
	}

	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	@Override
	public String toString() {
		return "prod_congelado [temp=" + temp + "]";
	}
	
	

}
