package EJERCICIO3;

public class Edificio implements Iedificio {

	private double superficie;
	
	public double getSuperficieEdificio()
	{
		return 1311;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	@Override
	public String toString() {
		return "Superficie "+ getSuperficie();
	}

	
	
}
