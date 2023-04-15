package dominio;

public class Persona {
	
	private String nombre; 
	private int dni;
	
	// contructors
	
	public Persona()
	{
		nombre = "vacio";
		dni = 0; 
	}
	
	public Persona(String nombre, int dni)
	{
	this.nombre = nombre;
	this.dni = dni; 
	}
	// setters and getters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + "]";
	}
	
	

}
