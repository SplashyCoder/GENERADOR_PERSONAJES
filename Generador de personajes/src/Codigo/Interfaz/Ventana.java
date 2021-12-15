package Codigo.Interfaz;

import javax.swing.JFrame;

public class Ventana extends JFrame{
	
	private ControladorEvento control;
	private panelInicial panelInicial;
	private panelArmadura panelArmadura;
	private panelCreacion panelCreacion;
	
	public Ventana () {
		
		iniciarComponentes();
		capturarEventos();
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
		
		panelArmadura = new panelArmadura();
		this.add(panelArmadura);
		
		panelCreacion = new panelCreacion();
		this.add(panelCreacion);
		
		panelInicial.setVisible(true);
		visibilizarPanelFinal(false);
		
	}
	
	public ControladorEvento getControl() {
		if (control == null) {
			control = new ControladorEvento(this);
			}
		return control;
		
	}
	public void capturarEventos() {
		
		panelInicial.getBotonSalir().addActionListener(getControl());
		panelInicial.getBotonCrear().addActionListener(getControl());
		panelCreacion.getBotonVolver().addActionListener(getControl());
		
	}
	
	public void visibilizarPanelFinal(boolean valor) {
		
		panelArmadura.setVisible(valor);
		panelCreacion.setVisible(valor);
		
	}
	
	
	public panelInicial getPanelInicial() {
		return panelInicial;
	}

	public panelArmadura getPanelArmadura() {
		return panelArmadura;
	}

	public panelCreacion getPanelCreacion() {
		return panelCreacion;
	}

}
