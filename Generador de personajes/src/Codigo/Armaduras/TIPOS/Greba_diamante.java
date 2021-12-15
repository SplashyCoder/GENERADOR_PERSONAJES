package Codigo.Armaduras.TIPOS;

import Codigo.Armaduras.Greba;

public class Greba_diamante implements Greba{

    @Override
	public String getStats() {
		return "Armadura 20";
	}

	@Override
	public String getImage() {
		return "/Material/grebaDiamante.png" ;
	}
}