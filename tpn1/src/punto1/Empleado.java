package punto1;

public class Empleado {

	private final int id; 
	private String nombre; 
	private int edad; 
    public static int cont=  999 ;
	
	// constructores
	public Empleado()
	{
		cont++;
		this.id = cont;
		this.edad = 0;
		this.nombre = "sin nombre";
				
	}
	
	public Empleado(String nombre, int edad)
	{
		cont++;
		this.id = cont;
		this.edad = edad;
		this.nombre = nombre;
	}

	// setters and getters
	public int getId() {
		return id;
	}

	/*public void setId(int id) {
		this.id = id;
	}*/

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

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	// metodo toString
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", edad=" + edad +  "]";
	}
		
	
}
