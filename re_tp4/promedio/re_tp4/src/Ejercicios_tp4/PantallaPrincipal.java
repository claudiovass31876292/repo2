	package Ejercicios_tp4;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class PantallaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JButton btnEjercicio1;
    private JButton btnEjercicio2;
    private JButton btnEjerciccio3;	
    private JLabel lblNewLabel;
	/**
	 * Create the frame.   ¿Me pide crear un frame ?  22:57 desde pc tigre el 27/03/23 
	 */
	public PantallaPrincipal() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane); // con esta propiedad estoy asociando el JPanel al JFrame
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		creacionBotones();
		
		lblNewLabel = new JLabel("GRUPO NRO: 5");
    	lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(153, 21, 123, 14);
		panel.add(lblNewLabel);
	}
	
	public void creacionBotones() {
		btnEjercicio1 = new JButton("EJERCICIO 1");
		btnEjercicio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(" ¡You are selected EJERCICIO 1! ");
				try {
					Contactos frame = new Contactos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnEjercicio1.setBounds(153, 64, 123, 23);
		panel.add(btnEjercicio1);
		
		btnEjercicio2 = new JButton("EJERCICIO 2");
		btnEjercicio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(" ¡You are in EJERCIO 2!");
				try {
					Promedios frame = new Promedios();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnEjercicio2.setBounds(153, 115, 123, 23);
		panel.add(btnEjercicio2);
		
		btnEjerciccio3 = new JButton("EJERCICIO 3");
		btnEjerciccio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(" ¡You are in EJERCICIO 3! ");
			}
		});
		btnEjerciccio3.setBounds(153, 165, 123, 23);
		panel.add(btnEjerciccio3);
		
	}
	
}
