package Codigo.Interfaz;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class panelArmadura extends JPanel{
	
	//Componenetes no interactivos
	private JLabel etiquetaArmadura;
	
	
	//Componenetes interactivos
	private JLabel etiquetaYelmoImg;
	private JLabel etiquetaPetoImg;
	private JLabel etiquetaGrebaImg;
	private JLabel etiquetaEscarpeImg;
	private JLabel etiquetaYelmoDes;
	private JLabel etiquetaPetoDes;
	private JLabel etiquetaGrebaDes;
	private JLabel etiquetaEscarpeDes;
	
	public panelArmadura() {
		
		this.setBounds(0, 0, 398, 471);
		this.setLayout(null);
		
		etiquetaArmadura= new JLabel("\u00A1ARMADURA!");
		etiquetaArmadura.setFont(new Font("Tahoma", Font.PLAIN, 18));
		etiquetaArmadura.setBounds(161, 0, 163, 25);
		this.add(etiquetaArmadura);
		
		etiquetaYelmoImg = new JLabel("");
		etiquetaYelmoImg.setIcon(new ImageIcon(panelArmadura.class.getResource("/Material/yelmoCuero.png")));
		etiquetaYelmoImg.setBounds(10, 39, 100, 80);
		this.add(etiquetaYelmoImg);
		
		etiquetaPetoImg = new JLabel("");
		etiquetaPetoImg.setIcon(new ImageIcon(panelArmadura.class.getResource("/Material/petoCuero.png")));
		etiquetaPetoImg.setBounds(10, 137, 100, 80);
		this.add(etiquetaPetoImg);
		
		etiquetaGrebaImg = new JLabel("");
		etiquetaGrebaImg.setIcon(new ImageIcon(panelArmadura.class.getResource("/Material/grebaCuero.png")));
		etiquetaGrebaImg.setBounds(10, 243, 100, 80);
		this.add(etiquetaGrebaImg);
		
		etiquetaEscarpeImg = new JLabel("");
		etiquetaEscarpeImg.setIcon(new ImageIcon(panelArmadura.class.getResource("/Material/escarpeCuero.png")));
		etiquetaEscarpeImg.setBounds(10, 351, 100, 80);
		this.add(etiquetaEscarpeImg);
		
		etiquetaYelmoDes = new JLabel("Este Yelmo est\u00E1 creado con el cuero ");
		etiquetaYelmoDes.setBounds(133, 36, 255, 38);
		this.add(etiquetaYelmoDes);
		
		etiquetaPetoDes = new JLabel("Este Yelmo est\u00E1 creado con el cuero ");
		etiquetaPetoDes.setBounds(133, 138, 255, 38);
		this.add(etiquetaPetoDes);
		
		etiquetaGrebaDes = new JLabel("Este Yelmo est\u00E1 creado con el cuero ");
		etiquetaGrebaDes.setBounds(133, 243, 255, 38);
		this.add(etiquetaGrebaDes);
		
		etiquetaEscarpeDes = new JLabel("Este Yelmo est\u00E1 creado con el cuero ");
		etiquetaEscarpeDes.setBounds(133, 351, 255, 38);
		this.add(etiquetaEscarpeDes);
		
	}
	
	public JLabel getEtiquetaYelmoImg() {
		return etiquetaYelmoImg;
	}

	public JLabel getEtiquetaPetoImg() {
		return etiquetaPetoImg;
	}

	public JLabel getEtiquetaGrebaImg() {
		return etiquetaGrebaImg;
	}

	public JLabel getEtiquetaEscarpeImg() {
		return etiquetaEscarpeImg;
	}

	public JLabel getEtiquetaYelmoDes() {
		return etiquetaYelmoDes;
	}

	public JLabel getEtiquetaPetoDes() {
		return etiquetaPetoDes;
	}

	public JLabel getEtiquetaGrebaDes() {
		return etiquetaGrebaDes;
	}

	public JLabel getEtiquetaEscarpeDes() {
		return etiquetaEscarpeDes;
	}
	
}
