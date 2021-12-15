package Codigo.Armaduras.TIPOS;

import Codigo.Armaduras.Yelmo;

public class Yelmo_diamante implements Yelmo{

    @Override
	public String getStats() {
		return "Armadura 30";
	}

	@Override
	public String getImage() {
		return "/Material/yelmoDiamante.png" ;
	}

}