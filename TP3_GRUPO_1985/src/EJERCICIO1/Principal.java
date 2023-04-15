package EJERCICIO1;

import javax.swing.JOptionPane;



public class Principal {

	public static void main(String[] args) {
	
	
		try
		{
		String dni_ingresado = JOptionPane.showInputDialog("Ingrese DNI: ");
		DNI.verificarDniInvalido(dni_ingresado);
		System.out.println(" Ingreso exitoso! ");
		}
		catch(DniIvalido e)
		{
		  // ESTA LINEA SOLO TE AGREGA UN COMENTARIO INNECESARIO 	System.out.println("Error falta arroba ");
			e.printStackTrace();
		}
	}
}
