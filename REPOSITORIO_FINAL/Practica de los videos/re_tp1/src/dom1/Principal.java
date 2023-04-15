package dom1;

public class Principal {

	public static void main(String[] args) {
		
		Empleado[] vEmp = new Empleado[5];
		vEmp[0]= new Empleado("nombre1",51);
		vEmp[1]= new Empleado("nombre2",42);
		vEmp[2]= new Empleado("nombre3",27);
		vEmp[3]= new Empleado("nombre4",30);
		vEmp[4]= new Empleado();
		
		for (Empleado empleado : vEmp) {
			System.out.println(empleado);
		}
		
		System.out.println("El proximo ID es: "+Empleado.devuelveIdProx());
				
		Empleado e = new Empleado();
		e.setEdad(37);
		e.setNombre("Claudio Vass");
		System.out.println(e);
		
	}

}
