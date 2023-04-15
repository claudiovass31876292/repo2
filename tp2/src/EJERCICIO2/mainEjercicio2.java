package EJERCICIO2;

public class mainEjercicio2 {

	public static void main(String[] args) {
		
		prod_fresco pf = new prod_fresco();
		pf.setFechaCaducidad("10/10/92");
		pf.setFechaEnvasado("10/10/1885");
		pf.setNumeroLote(1);
		pf.setPaisOrigen("Argentina");
		
		System.out.println(pf.toString());
		
		prod_congelado pc = new prod_congelado();
		pc.setFechaCaducidad("24/7/24");
		pc.setNumeroLote(12);
		pc.setTemp(16);
		
		System.out.println(pc.toString());
		
		prod_refrigerado pr = new prod_refrigerado();
		pr.setCodOrganismo(4487);
		pr.setFechaCaducidad("18/2/25");
		pr.setNumeroLote(9);
		
		System.out.println(pr.toString());
		
	}

}
