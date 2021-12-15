package Codigo.Armaduras.Fabricas;

import Codigo.Armaduras.Escarpe;
import Codigo.Armaduras.Greba;
import Codigo.Armaduras.Peto;
import Codigo.Armaduras.Yelmo;
import Codigo.Armaduras.TIPOS.Yelmo_diamante;
import Codigo.Armaduras.TIPOS.Peto_diamante;
import Codigo.Armaduras.TIPOS.Greba_diamante;
import Codigo.Armaduras.TIPOS.Escarpe_diamante;

public class FabricaDiamante implements FabricaAbstracta{

	@Override
	public Yelmo crearYelmo() {
		return new Yelmo_diamante();
	}

	@Override
	public Peto crearPeto() {
		return new Peto_diamante();
	}

	@Override
	public Greba crearGrebas() {
		return new Greba_diamante();
	}

	@Override
	public Escarpe crearEscarpe() {
		return new Escarpe_diamante();
	}

}