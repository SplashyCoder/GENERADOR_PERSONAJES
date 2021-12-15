package Codigo.Armaduras.TIPOS;

import Codigo.Armaduras.Peto;

public class Peto_hierro implements Peto{

    @Override
	public String getStats() {
		return "Armadura 25";
	}

	@Override
	public String getImage() {
		return "/Material/petoHierro.png" ;
	}
}