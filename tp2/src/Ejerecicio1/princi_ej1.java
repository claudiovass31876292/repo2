package Ejerecicio1;

public class princi_ej1 {

	public static void main(String[] args) {
	

		Profesor[] vProf = new Profesor[4];
		vProf[0] = new Profesor("Jeremias",38,"Director",2);
		vProf[1] = new Profesor("Pedro",3,"Profesor",12);
		vProf[2] = new Profesor("Ricardo",8,"Preceptor",22);
		vProf[3] = new Profesor("Ricardo",8,"Preceptor",22);
		
		for (Profesor profesor : vProf) {
			System.out.println(profesor.toString());
		}
		/*
		Profesor p = new Profesor();
		p.setNombre("jere");
		p.setCargo("Director");*/
	}

}
