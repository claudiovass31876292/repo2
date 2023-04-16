package Ejercicios_tp4;

import java.awt.EventQueue;

public class Principal {

	public static void main(String[] args) {
		
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						PantallaPrincipal frame = new PantallaPrincipal();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					
				}
			});
		}
	}


