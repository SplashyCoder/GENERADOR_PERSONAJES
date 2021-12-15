package Codigo.Interfaz;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class panelCreacion extends JPanel{
	
	//Componenetos no interactivos
	private JLabel etiquetaPersonaje;
	//Componentes interactivos
	private JScrollPane scrollTablaPersona;
	private DefaultTableModel modelo;
	private JTable tablaPersona;
	private JButton botonVolver;
	
	public panelCreacion() {
		
		this.setBounds(404, 0, 368, 447);
		this.setLayout(new BorderLayout(0, 0));
		
		etiquetaPersonaje = new JLabel("                \u00A1PERSONAJES CREADOS!");
		etiquetaPersonaje.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.add(etiquetaPersonaje, BorderLayout.NORTH);
		

		
		scrollTablaPersona = new JScrollPane();
		scrollTablaPersona.setBounds(10, 54, 274, 255);
		this.add(scrollTablaPersona,BorderLayout.CENTER);
		String [] columnNames = {"PEROSNAJE"};
		modelo = new DefaultTableModel(columnNames,0){
        	public boolean isCellEditable (int filas, int columnas) {
        		if (columnas == 1) {
        			return true;
        		}else {
        			return false;
        		}
        	}
        };;
		tablaPersona = new JTable(modelo);
		scrollTablaPersona.setViewportView(tablaPersona);
		
		botonVolver = new JButton("VOLVER");
		this.add(botonVolver, BorderLayout.SOUTH);
		
		
	}
	
	public JScrollPane getScrollTablaPersona() {
		return scrollTablaPersona;
	}

	public DefaultTableModel getModelo() {
		return modelo;
	}

	public JTable getTablaPersona() {
		return tablaPersona;
	}

	public JButton getBotonVolver() {
		return botonVolver;
	}

}
