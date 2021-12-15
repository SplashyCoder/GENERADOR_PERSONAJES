package Codigo.Armaduras.TIPOS;

import Codigo.Armaduras.Yelmo;

public class Yelmo_oro implements Yelmo{

    @Override
	public String getStats() {
		return "Armadura 10";
	}

	@Override
	public String getImage() {
		return "/Material/yelmoOro.png" ;
	}
}