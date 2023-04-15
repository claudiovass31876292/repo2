	package pantalla_principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import pantalla_principal.ventana_principal;

import javax.swing.JTextField;

public class eventoboton implements ActionListener {

	private JTextField t;
	
	//SE PUEDE PASAR EL TXT POR CONSTRUCTOR O POR SET Y GET por ejemplo:
	public eventoboton()
	{
		
	}
	
	public JTextField getT() {
		return t;
	}

	public void setT(JTextField t) {
		this.t = t;
	}

	//constructor creado para pasar por parametro un txt
	public eventoboton(JTextField txtNombre) {
 
	  t = txtNombre;
		 
	}
 
	@Override
	public void actionPerformed(ActionEvent arg0) {
	
		//para pasar el txt lo hago mediante el constructor que esta en la clase ventana_principal
		System.out.println("Hola ...." + t.getText());

	}

}
