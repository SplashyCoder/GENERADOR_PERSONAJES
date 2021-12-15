package Codigo.Armaduras.TIPOS;

import Codigo.Armaduras.Escarpe;

public class Escarpe_hierro implements Escarpe{

    @Override
	public String getStats() {
		return "Armadura 10";
	}

	@Override
	public String getImage() {
		return "/Material/escarpeHierro.png" ;
	}

}