package Codigo.Armaduras.TIPOS;

import Codigo.Armaduras.Peto;

public class Peto_diamante implements Peto{

    @Override
	public String getStats() {
		return "Armadura 50";
	}

	@Override
	public String getImage() {
		return "/Material/petoDiamante.png" ;
	}

}