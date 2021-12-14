package Codigo;

import javax.swing.JFrame;

public class Ventana extends JFrame{
	
	private panelInicial panelInicial;
	
	public Ventana () {
		
		iniciarComponentes();
		
	}
	
	public void iniciar() {
		
		this.setVisible(true);
		
	}
	
	
	public void iniciarComponentes() {
		
		this.setTitle("Creación de personajes");
		this.setBounds(100, 100, 800, 500);
		this.getContentPane().setLayout(null);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		panelInicial = new panelInicial();
		this.add(panelInicial);
		
		panelInicial.setVisible(true);
		
	}

}
