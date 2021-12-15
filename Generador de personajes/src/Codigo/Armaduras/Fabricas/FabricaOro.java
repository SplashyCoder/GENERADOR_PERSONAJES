package Codigo.Armaduras.Fabricas;

import Codigo.Armaduras.Escarpe;
import Codigo.Armaduras.Greba;
import Codigo.Armaduras.Peto;
import Codigo.Armaduras.Yelmo;
import Codigo.Armaduras.TIPOS.Yelmo_oro;
import Codigo.Armaduras.TIPOS.Peto_oro;
import Codigo.Armaduras.TIPOS.Greba_oro;
import Codigo.Armaduras.TIPOS.Escarpe_oro;

public class FabricaOro implements FabricaAbstracta{

	@Override
	public Yelmo crearYelmo() {
		return new Yelmo_oro();
	}

	@Override
	public Peto crearPeto() {
		return new Peto_oro();
	}

	@Override
	public Greba crearGrebas() {
		return new Greba_oro();
	}

	@Override
	public Escarpe crearEscarpe() {
		return new Escarpe_oro();
	}

}