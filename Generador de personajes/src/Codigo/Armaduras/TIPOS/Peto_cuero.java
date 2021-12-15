package Codigo.Armaduras.TIPOS;

import Codigo.Armaduras.Peto;

public class Peto_cuero implements Peto{

    @Override
	public String getStats() {
		return "Armadura 8";
	}

	@Override
	public String getImage() {
		return "/Material/petoCuero.png" ;
	}	

}