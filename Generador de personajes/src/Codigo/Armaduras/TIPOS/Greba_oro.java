package Codigo.Armaduras.TIPOS;

import Codigo.Armaduras.Greba;

public class Greba_oro implements Greba{

    @Override
	public String getStats() {
		return "Armadura 4";
	}

	@Override
	public String getImage() {
		return "/Material/grebaOro.png" ;
	}

}