package Ejercicio1;

public class mainEjercicio1_a {

	public static void main(String[] args) {
		
		Profesor[] vProf = new Profesor[5];
		vProf[0] = new Profesor("Carlos Primero",33,"encargado",2);
		vProf[1] = new Profesor("Edgardo Cuarto",40,"Informatico",1);
		vProf[2] = new Profesor("Sebastian Tercero",35,"Cientifico",3);
		vProf[3] = new Profesor("Edgardo Cuarto",40,"Informatico",1);
		vProf[4] = new Profesor("Edgardo Cuarto",40,"Informatico",1);
		
		for (Profesor profesor : vProf) {
			System.out.println(profesor);
		}			
																		
		}
		
}
