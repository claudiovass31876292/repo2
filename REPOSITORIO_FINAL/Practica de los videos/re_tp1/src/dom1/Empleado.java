package dom1;

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
		return "Empleado: " + nombre + ", Edad: " +edad + ", Legajo: " + id ;
	}
	
		
}
