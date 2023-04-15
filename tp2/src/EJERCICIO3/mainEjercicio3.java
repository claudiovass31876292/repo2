package EJERCICIO3;

public class mainEjercicio3 {

	public static void main(String[] args) {
		
		/*Polideportivo pol = new Polideportivo();
		pol.setNombre("Central");
		pol.setSuperficie(1344);
		*/
		Edificio edif = new Edificio();
		edif.setSuperficie(4444);
		
		InstalacionDeportiva idep = new InstalacionDeportiva();
		idep.setTipoInst(1);
		
	
		I_instalacionDeportiva id = idep;
        Iedificio e = edif;		
		
		Polideportivo pol = new Polideportivo();
		pol.setSuperficie(id);
		pol.setEdificio(e);
		pol.setNombre("Central");
		
		System.out.println(pol.toString());
	
		
	}

}
