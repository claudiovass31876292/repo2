package EJERCICIO1;

public class DniIvalido extends Exception {
	
	public DniIvalido()
	{
		
	}

	@Override
	public String getMessage() {
		
		return "- ¡ DNI invalido intente nuevamente - !";
	}
	
	

}
