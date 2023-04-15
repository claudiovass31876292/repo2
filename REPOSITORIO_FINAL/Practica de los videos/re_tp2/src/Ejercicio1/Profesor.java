package Ejercicio1;

public class Profesor extends Empleado{

	private String cargo;
	private int antiguedad; 
	
	//constructor
	public Profesor()
	{
		super();
		this.cargo = "vacio";
		this.antiguedad =0;
	}
	public Profesor(String nombre, int edad, String cargo,int antiguedad)
	{
			super(nombre,edad);	
			this.cargo = cargo;
			this.antiguedad = antiguedad; 
	}
	
    //setters and getters  
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	//metodo to string
	@Override
	public String toString() {
		return "Profesor [cargo=" + cargo + ", antiguedad=" + antiguedad + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + antiguedad;
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		if (antiguedad != other.antiguedad)
			return false;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		return true;
	}
		
}
