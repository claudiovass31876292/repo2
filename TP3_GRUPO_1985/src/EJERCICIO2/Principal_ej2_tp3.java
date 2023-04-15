package EJERCICIO2;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.ListIterator;

public class Principal_ej2_tp3 {

	public static void main(String[] args) {
 
		Archivos Arch = new Archivos();
		Arch.setRuta("personas.txt");
		
		//creo objetos persona en una lista y se los envio enun TreeSet
	
		TreeSet <Persona> listaPersona = new TreeSet<Persona>();
		Persona p1 = new Persona(/*dni*/31876292,/*nombre*/" Jeremias ",/*apellido*/" Galeano ");
		Persona p2 = new Persona(/*dni*/31876293,/*nombre*/" Miller ",/*apellido*/" Stevenson ");
		Persona p3 = new Persona(/*dni*/31876291,/*nombre*/" Sebatian ",/*apellido*/" Feller ");

	    listaPersona.add(p1);
	    listaPersona.add(p1);
	    listaPersona.add(p2);
	    listaPersona.add(p3);
	    
	    Iterator<Persona> lp = listaPersona.iterator();
	    while(lp.hasNext()) {
	    	
	    	Persona p = (Persona) lp.next();
	    	//pregunto si existe el archivo 
	    	if(Arch.existe()){
	    		Arch.escribe_lineas(p.getNombre());
	    		Arch.escribe_lineas(p.getApellido());
	    		//Arch.escribe_numeros(p.getDni());
	    		
	    	}
	    	Arch.lee_lineas();	
	    	//System.out.println(p.toString());
						
	    }
		    
	    // necesito uno donde pueda pasar los datos por set
		// estop se debe grabar en el github  22/03/23 
		
	}

}
