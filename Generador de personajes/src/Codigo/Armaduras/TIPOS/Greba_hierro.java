package Codigo.Armaduras.TIPOS;

import Codigo.Armaduras.Greba;

public class Greba_hierro implements Greba{

    @Override
	public String getStats() {
		return "Armadura 20";
	}

	@Override
	public String getImage() {
		return "/Material/grebaHierro.png" ;
	}

}