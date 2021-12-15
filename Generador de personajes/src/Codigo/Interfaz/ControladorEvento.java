package Codigo.Interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorEvento implements ActionListener {

	private Ventana interfaz;
	
	public ControladorEvento (Ventana interfaz) {
		
		this.interfaz = interfaz;
				
	}
	
	public void actionPerformed(ActionEvent ae) {	
		
		if (ae.getSource() == (interfaz.getPanelInicial().getBotonSalir())) {
			salir();
		}
		
	}
	
	public void salir() {
		System.exit(0);
	}
	
}