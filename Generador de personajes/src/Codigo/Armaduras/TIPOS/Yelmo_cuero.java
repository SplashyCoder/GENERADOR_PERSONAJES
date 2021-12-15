package Codigo.Armaduras.TIPOS;

import Codigo.Armaduras.Yelmo;

public class Yelmo_cuero implements Yelmo {

	@Override
	public String getStats() {
		return "Armadura 7";
	}

	@Override
	public String getImage() {
		return "/Material/yelmoCuero.png" ;
	}
}