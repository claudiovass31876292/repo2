package dominio;

public class Principal {

	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		p1.setDni(31876292);
		p1.setNombre("Jeremias");
		
		System.out.println(p1.toString());
	}

}
