package Codigo.Armaduras.TIPOS;

import Codigo.Armaduras.Yelmo;

public class Yelmo_Hierro implements Yelmo{

    @Override
	public String getStats() {
		return "Armadura 15";
	}

	@Override
	public String getImage() {
		return "/Material/yelmoHierro.png" ;
	}


}