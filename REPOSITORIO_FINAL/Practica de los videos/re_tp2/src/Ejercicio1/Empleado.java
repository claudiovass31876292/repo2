package Ejercicio1;

public class Empleado {

	
	private final int id;
	private String nombre;
	private int edad; 
	public static int cont =999;
	
	//metodo contador 
	/*public static final int contador (int cont)
	{
	cont++;
	return cont;
	}*/
			
	//metodo proximo id
	public static int devuelveIdProx()
	{
		return cont+1;
	}
	// constructors
	public Empleado() 
	{
	cont++;
	this.id = cont; 
    this.nombre = " sin nombre ";
	this.edad = 99; 
	}
	// constructors
	public Empleado(String nombre, int edad)
	{		
		cont++;
		this.id = cont;
		this.nombre =  nombre;
		this.edad = edad;
	}
	
	//setter and getters
		
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//metodo toString
	@Override
	public String toString() {
		return "Empleado: " + nombre + ", Edad: " +edad + ", Legajo: " + id   ;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + edad;
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (edad != other.edad)
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
		
}
