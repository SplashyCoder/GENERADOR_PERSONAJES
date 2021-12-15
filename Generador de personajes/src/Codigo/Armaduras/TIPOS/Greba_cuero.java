package Codigo.Armaduras.TIPOS;

import Codigo.Armaduras.Greba;

public class Greba_cuero implements Greba{

    @Override
	public String getStats() {
		return "Armadura 2";
	}

	@Override
	public String getImage() {
		return "/Material/grebaCuero.png" ;
	}


}