package Ejercicios_tp4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Promedios extends JFrame{

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JPanel panelInferior;
	private Container panelSuperior;
	private JComboBox<String>  cbTps;
	private JLabel lblNota1;
	private JLabel lblNota2;
	private JLabel lblNota3;
	private JLabel lblTps;
	private JLabel lblPromedio;
	private JLabel lblCondicion;
	private JButton btnCalcular;
	private JButton btnNuevo;
	JButton btnSalir;
	private JTextField txtPromedio;
	private JTextField txtCondicion;
	

	
	public Promedios() {
		setTitle("Promedios");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 515, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelInferior = new JPanel();
		panelInferior.setBorder(new TitledBorder(null, "Notas del alumno", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelInferior.setBackground(Color.WHITE);
		panelInferior.setBounds(22, 208, 268, 155);
		contentPane.add(panelInferior);
		panelInferior.setLayout(null);
		
		lblPromedio = new JLabel("Promedio");
		lblPromedio.setBounds(10, 30, 46, 14);
		panelInferior.add(lblPromedio);
		
		lblCondicion = new JLabel("Condicion");
		lblCondicion.setBounds(10, 69, 46, 14);
		panelInferior.add(lblCondicion);
		
		txtPromedio = new JTextField();
		txtPromedio.setBounds(117, 27, 100, 20);
		panelInferior.add(txtPromedio);
		txtPromedio.setColumns(10);
		
		txtCondicion = new JTextField();
		txtCondicion.setBounds(117, 66, 100, 20);
		panelInferior.add(txtCondicion);
		txtCondicion.setColumns(10);
		
		panelSuperior = new JPanel();
		panelSuperior.setBounds(22, 60, 268, 137);
		contentPane.add(panelSuperior);
		panelSuperior.setLayout(null);
		//panelSuperior.add( creaBorde( new TitledBorder("Notas del alumno") ) );
		
		
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(109, 20, 103, 20);
		panelSuperior.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setBounds(109, 45, 103, 20);
		panelSuperior.add(txtNota2);
		txtNota2.setColumns(10);
		
		txtNota3 = new JTextField();
		txtNota3.setBounds(109, 70, 103, 20);
		panelSuperior.add(txtNota3);
		txtNota3.setColumns(10);
		
		cbTps = new JComboBox<String>();
		cbTps.setBounds(109, 98, 103, 20);
		panelSuperior.add(cbTps);
		
		btnCalcular = new JButton("CALCULAR ");
		btnCalcular.addActionListener(new eventoCalcular());
		btnCalcular.setBounds(319, 60, 123, 35);
		contentPane.add(btnCalcular);
		
		btnNuevo = new JButton("NUEVO");
		btnNuevo.addActionListener(new eventoNuevo());
		btnNuevo.setBounds(319, 99, 123, 35);
		contentPane.add(btnNuevo);
		
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new eventoSalir());
		btnSalir.setBounds(319, 141, 123, 35);
		contentPane.add(btnSalir);
		cbTps.addItem("APROBADO");
		cbTps.addItem("DESAPROBADO");
		
		creacionLabel();
	}

	private boolean isInt(String str) {
		try 
		{
		Integer.parseInt(str);
		return true;
		}
		catch (Throwable e )
		{
			return false;
		}
	
	}


	/*static JPanel creaBorde( javax.swing.border.Border b ) {
	    JPanel panel = new JPanel();
	    String str = b.getClass().toString();
	    
	    str = str.substring( str.lastIndexOf('.') + 1 );
	    panel.setLayout( new BorderLayout() );
	    panel.add(new JLabel( str,JLabel.CENTER ),BorderLayout.CENTER );
	    panel.setBorder( b );
	    
	    return( panel );
	  }
	*/
      public class eventoCalcular implements ActionListener
	{
	
			public void actionPerformed(ActionEvent arg0) {
		    
				String n1 = txtNota1.getText().trim();
				String n2 = txtNota2.getText().trim();
				String n3 = txtNota3.getText().trim();
				
				if(n1.isEmpty() || n2.isEmpty() || n3.isEmpty())
				{
				 JOptionPane.showMessageDialog(contentPane, "Complete todos los campos","Error", JOptionPane.ERROR_MESSAGE);
				 return;
				}
				
				if(!isInt(n1) || !isInt(n2) || !isInt(n3))
				{
					JOptionPane.showMessageDialog(contentPane, "Ingrese un valor numerico","Error",JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				float nota1 = Integer.parseInt(n1);
				float nota2 = Integer.parseInt(n2);
				float nota3 = Integer.parseInt(n3);
				float prom = (nota1+nota2+nota3)/3;
				txtPromedio.setText(prom+"");
				
			}

	}
	
      public class eventoNuevo implements ActionListener
      {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			txtNota1.setText("");
			txtNota2.setText("");
			txtNota3.setText("");
			txtCondicion.setText("");
			txtPromedio.setText("");
			
		}
    	  
      }

      public class eventoSalir implements ActionListener
      {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			// hacer que cierre la ventana al clikeat el boton 
		System.exit(JFrame.DISPOSE_ON_CLOSE);
		
			
		}
    	  
      }
      
	public void creacionLabel()
	{
		lblNota1 = new JLabel("Nota 1 :");
		lblNota1.setBounds(10, 26, 46, 14);
		panelSuperior.add(lblNota1);
		
		lblNota2 = new JLabel("Nota 2 : ");
		lblNota2.setBounds(10, 51, 46, 14);
		panelSuperior.add(lblNota2);
		
		lblNota3 = new JLabel("Nota 3 : ");
		lblNota3.setBounds(10, 76, 46, 14);
		panelSuperior.add(lblNota3);
		
		lblTps = new JLabel("TPS");
		lblTps.setBounds(10, 101, 46, 14);
		panelSuperior.add(lblTps);	
	}
}
