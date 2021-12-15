package Codigo.Armaduras.Fabricas;

import Codigo.Armaduras.Escarpe;
import Codigo.Armaduras.Greba;
import Codigo.Armaduras.Peto;
import Codigo.Armaduras.Yelmo;
import Codigo.Armaduras.TIPOS.Yelmo_cuero;
import Codigo.Armaduras.TIPOS.Peto_cuero;
import Codigo.Armaduras.TIPOS.Greba_cuero;
import Codigo.Armaduras.TIPOS.Escarpe_cuero;

public class FabricaCuero implements FabricaAbstracta{

	@Override
	public Yelmo crearYelmo() {
		return new Yelmo_cuero();
	}

	@Override
	public Peto crearPeto() {
		return new Peto_cuero();
	}

	@Override
	public Greba crearGrebas() {
		return new Greba_cuero();
	}

	@Override
	public Escarpe crearEscarpe() {
		return new Escarpe_cuero();
	}

}
