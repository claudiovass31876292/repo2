package EJERCICIO3;

public class Polideportivo implements I_instalacionDeportiva, Iedificio {

	private I_instalacionDeportiva superficie;
	private String nombre;
	private Iedificio edificio;
	
	public Polideportivo()
	{
		
	}
	
	public Polideportivo(I_instalacionDeportiva superficie, String nombre, Iedificio edificio)
	{
		super();
		this.superficie = superficie;
		this.nombre = nombre;
		this.edificio = edificio;
	}

	public I_instalacionDeportiva getSuperficie() {
		return superficie;
	}

	public void setSuperficie(I_instalacionDeportiva id) {
		this.superficie = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Iedificio getEdificio() {
		return edificio;
	}

	public void setEdificio(Iedificio edificio) {
		this.edificio = edificio;
	}

	@Override
	public String toString() {
		return "Polideportivo: Superfice" + superficie + ", nombre=" + nombre + ", edificio=" + edificio + "]";
	}

	@Override
	public double getSuperficieEdificio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTipoDeInstalacion() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
}
