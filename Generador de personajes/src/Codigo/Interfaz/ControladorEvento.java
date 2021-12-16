package Codigo.Interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;

import Codigo.Armaduras.Escarpe;
import Codigo.Armaduras.Greba;
import Codigo.Armaduras.Personaje;
import Codigo.Armaduras.Peto;
import Codigo.Armaduras.Yelmo;
import Codigo.Armaduras.Fabricas.FabricaAbstracta;
import Codigo.Armaduras.Fabricas.FabricaCuero;
import Codigo.Armaduras.Fabricas.FabricaDiamante;
import Codigo.Armaduras.Fabricas.FabricaHierro;
import Codigo.Armaduras.Fabricas.FabricaOro;

public class ControladorEvento implements ActionListener {

	private Ventana interfaz;
	
	public ControladorEvento (Ventana interfaz) {
		
		this.interfaz = interfaz;
				
	}
	
	public void actionPerformed(ActionEvent ae) {	
		
		if (ae.getSource() == (interfaz.getPanelInicial().getBotonSalir())) {
			salir();
		}
		if (ae.getSource() == (interfaz.getPanelInicial().getBotonCrear())) {
		
			cambiarPanel (interfaz.getPanelInicial(), interfaz.getPanelArmadura(), interfaz.getPanelCreacion());
			
		}
		if (ae.getSource() == (interfaz.getPanelCreacion().getBotonVolver())) {
			
			cambiarAPanelInicial(interfaz.getPanelInicial(), interfaz.getPanelArmadura(), interfaz.getPanelCreacion());
			
		}
		
	}
	
	public void salir() {
		
		System.exit(0);
		
	}
	
	public void cambiarPanel (panelInicial panelInicial, panelArmadura panelArmadura, panelCreacion panelCreacion) {
		
		int bandera = 0;
		
		
		if ((Integer)panelInicial.getNumPersonaje().getValue() == 0) {
			
			JOptionPane.showMessageDialog(null,"�Error al crear los personajes!","Intentelo de nuevo...",JOptionPane.ERROR_MESSAGE);
			
			bandera++;
			
		}
		
		if (bandera == 0) {
			
			ejecutarAbstracFactoryEnArmadura(panelInicial, panelArmadura);
			ejecutarSingletonEnCreacion(panelInicial, panelCreacion);
			
		}
	}
	
	public void ejecutarAbstracFactoryEnArmadura(panelInicial panelInicial, panelArmadura panelArmadura) {
		
		FabricaAbstracta fabrica = null;
		Yelmo yelmo;
		Peto peto;
		Greba greba;
		Escarpe escarpe;
		
		interfaz.getPanelInicial().setVisible(false);
		interfaz.visibilizarPanelFinal(true);
		
		
		switch (panelInicial.getTipoArmadura().getSelectedIndex()) {
		
            case 0:
                fabrica = new FabricaCuero();
                break;
            case 1:
                fabrica = new FabricaHierro();
                break;
            case 2:
                fabrica = new FabricaOro();
                break;
            case 3:
                fabrica = new FabricaDiamante();
                break;
            default:
            	JOptionPane.showMessageDialog(null,"�Algo sali� mal!","Saliendo del programa...",JOptionPane.ERROR_MESSAGE);
            	salir();
                break;
        }
		
		yelmo = fabrica.crearYelmo();
		peto = fabrica.crearPeto();
		greba = fabrica.crearGrebas();
		escarpe = fabrica.crearEscarpe();
		
		panelArmadura.getEtiquetaYelmoImg().setIcon(new ImageIcon(panelArmadura.class.getResource(yelmo.getImage())));
		panelArmadura.getEtiquetaYelmoDes().setText(yelmo.getStats());
		
		panelArmadura.getEtiquetaPetoImg().setIcon(new ImageIcon(panelArmadura.class.getResource(peto.getImage())));
		panelArmadura.getEtiquetaPetoDes().setText(peto.getStats());
		
		panelArmadura.getEtiquetaGrebaImg().setIcon(new ImageIcon(panelArmadura.class.getResource(greba.getImage())));
		panelArmadura.getEtiquetaGrebaDes().setText(greba.getStats());
		
		panelArmadura.getEtiquetaEscarpeImg().setIcon(new ImageIcon(panelArmadura.class.getResource(escarpe.getImage())));
		panelArmadura.getEtiquetaEscarpeDes().setText(escarpe.getStats());
		
		
	}
	
	public void ejecutarSingletonEnCreacion(panelInicial panelInicial, panelCreacion panelCreacion) {
		
		panelCreacion.getTablaPersona().setDefaultRenderer(Object.class, new ImgTabla());
		
		int contador = 0;
	
		int numeroPersonaje = (Integer)panelInicial.getNumPersonaje().getValue();
		int tipoArmadura = panelInicial.getTipoArmadura().getSelectedIndex();

		Personaje personaje;

		personaje = Personaje.getInstancia();

		switch (panelInicial.getTipoArmadura().getSelectedIndex()) {
		
            case 0:
                personaje.setArmadura("/Material/armaduraCuero.png");
                break;
            case 1:
				personaje.setArmadura("/Material/armaduraHierro.png");
                break;
            case 2:
				personaje.setArmadura("/Material/armaduraOro.png");
                break;
            case 3:
				personaje.setArmadura("/Material/armaduraDiamante.png");
                break;
            default:
            	JOptionPane.showMessageDialog(null,"�Algo sali� mal!","Saliendo del programa...",JOptionPane.ERROR_MESSAGE);
            	salir();
                break;
        }


		
		
		
		String[] nombreColumna = {"PERSONAJE"};
		
		panelCreacion.getTablaPersona().removeAll();
        
        DefaultTableModel modeloTabla = new DefaultTableModel() {
        	public boolean isCellEditable (int filas, int columnas) {
        		if (columnas == 1) {
        			return true;
        		}else {
        			return false;
        		}
        	}
        };
       
        modeloTabla.setColumnIdentifiers(nombreColumna); 
        panelCreacion.getTablaPersona().setModel(modeloTabla);     
        
        
        for(int i=0; i < numeroPersonaje; i++){
        	
        	Object[] data = {new JLabel (new ImageIcon(ControladorEvento.class.getResource(personaje.getArmadura())))};
        	
            modeloTabla.addRow(data);
            contador++;
            
        }
        
        panelCreacion.getTablaPersona().setRowHeight(130);
        panelCreacion.getTablaPersona().getColumnModel().getColumn(0).setResizable(false);        
        panelCreacion.getTablaPersona().getTableHeader().setReorderingAllowed(false) ;
		
        
	}
	
	public void cambiarAPanelInicial (panelInicial panelInicial, panelArmadura panelArmadura, panelCreacion panelCreacion) {
		
		interfaz.visibilizarPanelFinal(false);
		panelInicial.setVisible(true);
		
		panelInicial.getNumPersonaje().setValue(0);
		panelInicial.getTipoArmadura().setSelectedIndex(0);
	}
	
}