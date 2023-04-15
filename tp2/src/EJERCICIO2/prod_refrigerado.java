package EJERCICIO2;

public class prod_refrigerado extends Producto{

	private int codOrganismo;
	
	//constructores
	public prod_refrigerado()
	{
		super();
	}
	public prod_refrigerado(String fechaCaducidad, int numeroLote, int codOrganismo)
	{
		super(fechaCaducidad, numeroLote);
		this.codOrganismo = codOrganismo;
	}
	
	// setters and getters
	public int getCodOrganismo() {
		return codOrganismo;
	}
	public void setCodOrganismo(int codOrganismo) {
		this.codOrganismo = codOrganismo;
	}
	
	
	@Override
	public String toString() {
		return "prod_refrigerado [codOrganismo=" + codOrganismo + "]";
	}
	
	
	
	
}
