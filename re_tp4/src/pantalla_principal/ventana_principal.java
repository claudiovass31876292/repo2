package pantalla_principal;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class ventana_principal extends JFrame{
	
	//este numero sirve para saber si funciona el programa cuando lo envio a una salida externa
	private static final long serialVersionUID = 1L;
	
	JButton	boton = new JButton();
	JTextField txtNombre;
	
	public ventana_principal()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(500,500);
	    setLocation(350,350);
	    setTitle("Panel principal");
	    setLayout(null);	 
	  
	    
	    //creo instancia de JTextField
	 	   txtNombre = new JTextField(); // en el constructor se le setea la cantidad de columnas del txtbox
	 	   // o se puede setear como atributo
	 	   txtNombre.setColumns(10);
	 	   // seteo de ubicacion y tamaño
	 	   txtNombre.setBounds(63,33,200,36);
		  
	    
	    //cracion del boton 
	     
	    boton.setText("EJERCICIO 1");
	    boton.setBounds(175,200,135,30);
 	   // pasando el txt por constructor seria asi 
	   // boton.addActionListener(new eventoboton(txtNombre));// ref evento boton: siempre tiene que estar declarado antes el txt para no enviar un elemento nulo
 	   // y pasando el txt por inyectacion de set y get seria asi:
	    eventoboton e = new eventoboton();
	    e.setT(txtNombre);
	    boton.addActionListener(e); // esto seria pasarle el txt por constructor	
 	   
 	   //para agregar el boton al frame
	    getContentPane().add(boton);
	    // agregamos el txt
	    getContentPane().add(txtNombre);	
	    
	    
	}
	
	public void visibilidad(boolean estado)
	{
		setVisible(true);
	}
}
