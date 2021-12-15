package Codigo.Armaduras.TIPOS;

import Codigo.Armaduras.Escarpe;

public class Escarpe_cuero implements Escarpe{

    @Override
	public String getStats() {
		return "Armadura 3";
	}

	@Override
	public String getImage() {
		return "/Material/escarpeCuero.png" ;
	}

}