package Codigo.Armaduras.Fabricas;

import Codigo.Armaduras.Escarpe;
import Codigo.Armaduras.Greba;
import Codigo.Armaduras.Peto;
import Codigo.Armaduras.Yelmo;
import Codigo.Armaduras.TIPOS.Yelmo_Hierro;
import Codigo.Armaduras.TIPOS.Peto_hierro;
import Codigo.Armaduras.TIPOS.Greba_hierro;
import Codigo.Armaduras.TIPOS.Escarpe_hierro;

public class FabricaHierro implements FabricaAbstracta{

	@Override
	public Yelmo crearYelmo() {
		return new Yelmo_Hierro();
	}

	@Override
	public Peto crearPeto() {
		return new Peto_hierro();
	}

	@Override
	public Greba crearGrebas() {
		return new Greba_hierro();
	}

	@Override
	public Escarpe crearEscarpe() {
		return new Escarpe_hierro();
	}

}
