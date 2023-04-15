package Ejerecicio1;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class mainEjercicio1_b {

	public static void main(String[] args) {
		
		TreeSet <Profesor> listaProf = new TreeSet<Profesor>();
	    Profesor p1 = new Profesor("Juan",23,"Matematica",1);
	    Profesor p2 = new Profesor("Esteban",33,"ciencias",3);
	    Profesor p3 = new Profesor("Alicia",22,"Lengua",2);
	    Profesor p4 = new Profesor("Celina",21,"Ingles",1);
	    Profesor p5 = new Profesor("Celina",21,"Ingles",1);
	    
	    listaProf.add(p1);
	    listaProf.add(p1);
	    listaProf.add(p2);
	    listaProf.add(p3);
	    listaProf.add(p4);
	    listaProf.add(p5);
	    
	    Iterator<Profesor> lp = listaProf.iterator();
	    while(lp.hasNext()) {
	    	
	    	/*Profesor p = (Profesor) lp.next();
			System.out.println(p.toString());
	    	/**/
	    	//lp.next();
	    	System.out.println(lp.next().toString());
			
			
	    }
	    if(p4.equals(p5))
		{
			System.out.println("Son la misma persona");
		}
		else
		{
			System.out.println("No son la misma persona");
		}

	}

}
