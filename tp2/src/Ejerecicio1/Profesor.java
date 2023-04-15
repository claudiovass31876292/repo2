package Ejerecicio1;

public class Profesor extends Empleado implements Iempleado, Comparable<Profesor>{

	private String cargo;
	private int antiguedadDoc;
	
	//constructor
	public Profesor()
	{
		super();
		this.cargo = " vacio ";
		this.antiguedadDoc = 0;
	}
	public Profesor(String nombre, int edad, String cargo, int antiguedadDoc)
	{
		super(nombre,edad);
		this.cargo = cargo;
		this.antiguedadDoc = antiguedadDoc;		
	}
	
	
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getAntiguedadDoc() {
		return antiguedadDoc;
	}
	public void setAntiguedadDoc(int antiguedadDoc) {
		this.antiguedadDoc = antiguedadDoc;
	}
	
	//compareto
	@Override
	public int compareTo(Profesor o) {
		if(o.antiguedadDoc == this.antiguedadDoc)
			return 0;
		if(o.antiguedadDoc < this.antiguedadDoc)
		{
			return -1;
		}
		return 1;
	
	}
	
	//ToString
	
	@Override
	public String toString() {
		return "Empleado N°: "+ getId()+ " "+ getNombre()+" -- Cargo: "+ cargo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + antiguedadDoc;
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Profesor))
			return false;
		Profesor other = (Profesor) obj;
		if (antiguedadDoc != other.antiguedadDoc)
			return false;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		return true;
	}
	
	
	
	
}
