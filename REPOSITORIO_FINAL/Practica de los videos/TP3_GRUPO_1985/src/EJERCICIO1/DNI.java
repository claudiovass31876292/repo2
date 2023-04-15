package EJERCICIO1;

public class DNI {

	public DNI()
	{
		
	}
	
	public static boolean verificarDniInvalido(String dni) throws DniIvalido
	{
		boolean auxDni = false;
		
		  for (int x = 0; x < dni.length(); x++) {
		        char c = dni.charAt(x);
		        // Si no está entre a y z, ni entre A y Z, ni es un espacio
		        if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
		            
		        	//SI ENTRO ACA ES PORQUE SOLO HAY NUMEROS
		        	auxDni = true; 
		        }
		    
		  if (auxDni == false) {
			  throw new DniIvalido();
		  }
		   if(auxDni)
		   {
				return true;	

		  }
			return false;
		  }
		  return true;
}
}
