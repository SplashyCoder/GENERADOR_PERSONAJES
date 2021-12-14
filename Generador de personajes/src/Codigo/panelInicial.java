package Codigo;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class panelInicial extends JPanel{
	
	//Componenentes no interactivos
	JLabel etiquetaTitulo;
	JLabel etiquetaParrafo;
	JLabel etiquetaArmadura;
	JLabel etiquetaNumPersonaje;
	
	
	//Componenetes interactivos
	JComboBox comboBoxTipoArmadura;
	JSpinner spinnerNumPersonaje;
	JButton botonCrear;
	JButton botonSalir;
	
	public panelInicial () {
		
		this.setBounds(0, 0, 800, 500);
		this.setLayout(null);
		
		etiquetaTitulo = new JLabel("\u00A1Bienvenido a la creaci\u00F3n de personajes!");
		etiquetaTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		etiquetaTitulo.setBounds(242, 11, 333, 28);
		this.add(etiquetaTitulo);
		
		etiquetaParrafo = new JLabel("Por favor seleccione el tipo de armadura para los personajes y el n\u00FAmero de personajes a crear.");
		etiquetaParrafo.setBounds(28, 68, 756, 60);
		this.add(etiquetaParrafo);
		
		comboBoxTipoArmadura = new JComboBox();
		comboBoxTipoArmadura.setModel(new DefaultComboBoxModel(new String[] {"Cuero", "Hierro", "Oro", "Diamante"}));
		comboBoxTipoArmadura.setBounds(90, 211, 159, 22);
		this.add(comboBoxTipoArmadura);
		
		etiquetaArmadura = new JLabel("ARMADURA");
		etiquetaArmadura.setBounds(91, 186, 83, 14);
		this.add(etiquetaArmadura);
		
		spinnerNumPersonaje = new JSpinner();
		spinnerNumPersonaje.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinnerNumPersonaje.setBounds(570, 212, 61, 20);
		this.add(spinnerNumPersonaje);
		
		etiquetaNumPersonaje = new JLabel("N\u00DAMERO DE PERSONAJES");
		etiquetaNumPersonaje.setBounds(529, 186, 180, 14);
		this.add(etiquetaNumPersonaje);
		
		botonCrear = new JButton("CREAR");
		botonCrear.setBounds(346, 334, 89, 23);
		this.add(botonCrear);
		
		botonSalir = new JButton("SALIR");
		botonSalir.setBounds(660, 408, 89, 23);
		this.add(botonSalir);
		
	}
	
	public JComboBox getTipoArmadura () {
		return comboBoxTipoArmadura;
	}
	public JSpinner getNumPersonaje () {
		return spinnerNumPersonaje;
	}
	public JButton getBotonCrear() {
		return botonCrear;
	}
	public JButton getBotonSalir () {
		return botonSalir;
	}
	

}
