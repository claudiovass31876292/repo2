package EJERCICIO3;

public class InstalacionDeportiva implements I_instalacionDeportiva {

	private int tipoInst = 1;
	
	public int getTipoInst() {
		return tipoInst;
	}

	public void setTipoInst(int tipoInst) {
		this.tipoInst = tipoInst;
	}

	@Override
	public int getTipoDeInstalacion() {
		
		return 1;
	}

	@Override
	public String toString() {
		return "Tipo " + tipoInst + "]";
	}

	
	
	
}
