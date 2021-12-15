package Codigo.Armaduras.TIPOS;

import Codigo.Armaduras.Peto;

public class Peto_oro implements Peto{

    @Override
	public String getStats() {
		return "Armadura 20";
	}

	@Override
	public String getImage() {
		return "/Material/petoOro.png" ;
	}
}