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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.UIManager;

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
	private JTextField txtPromedio;
	private JTextField txtCondicion;
	

	
	public Promedios() {
		setTitle("Promedios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 413);
		contentPane = new JPanel();
		contentPane.setForeground(Color.MAGENTA);
		contentPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelInferior = new JPanel();
		panelInferior.setForeground(Color.MAGENTA);
		panelInferior.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelInferior.setBackground(Color.WHITE);
		panelInferior.setBounds(22, 208, 268, 155);
		contentPane.add(panelInferior);
		panelInferior.setLayout(null);
		
		lblPromedio = new JLabel("Promedio");
		lblPromedio.setBounds(10, 44, 87, 24);
		panelInferior.add(lblPromedio);
		
		lblCondicion = new JLabel("Condicion");
		lblCondicion.setBounds(10, 100, 46, 14);
		panelInferior.add(lblCondicion);
		
		txtPromedio = new JTextField();
		txtPromedio.setText("Promedio");
		txtPromedio.setBounds(107, 46, 108, 20);
		panelInferior.add(txtPromedio);
		txtPromedio.setColumns(10);
		
		txtCondicion = new JTextField();
		txtCondicion.setText("Condicion");
		txtCondicion.setBounds(107, 97, 108, 20);
		panelInferior.add(txtCondicion);
		txtCondicion.setColumns(10);
		panelInferior.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblPromedio, lblCondicion, txtPromedio, txtCondicion}));
		
		panelSuperior = new JPanel();
		panelSuperior.setForeground(Color.MAGENTA);
		panelInferior.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelSuperior.setBackground(Color.WHITE);
		panelSuperior.setBounds(22, 11, 268, 176);
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
		
		JButton btnCalcular = new JButton("CALCULAR ");
		btnCalcular.addActionListener(new eventoCalcular());
		btnCalcular.setBounds(319, 60, 123, 35);
		contentPane.add(btnCalcular);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.setBounds(319, 99, 123, 35);
		contentPane.add(btnNuevo);
		
		JButton btnNewButton_2 = new JButton("SALIR");
		btnNewButton_2.setBounds(319, 141, 123, 35);
		contentPane.add(btnNewButton_2);
		cbTps.addItem("tp1");
		cbTps.addItem("tp2");
		cbTps.addItem("tp3");
		
		creacionLabel();
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
		    
				// aca tiene desplegar los resultados en el panelInferior
				System.out.println("aca tiene desplegar los resultados en el panelInferior");
				int promedio = Integer.parseInt(txtNota1.getText()+txtNota2.getText()+txtNota3.getText());
				System.out.println(promedio);
				String promedioString = promedio+"";
				txtCondicion.setText(promedioString);
				
				
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
		panelSuperior.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{txtNota1, txtNota2, txtNota3, cbTps, lblNota1, lblNota2, lblNota3, lblTps}));
	}
}
