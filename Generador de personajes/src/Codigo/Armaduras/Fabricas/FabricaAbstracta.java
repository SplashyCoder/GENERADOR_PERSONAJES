package Codigo.Armaduras.Fabricas;

import Codigo.Armaduras.Escarpe;
import Codigo.Armaduras.Greba;
import Codigo.Armaduras.Peto;
import Codigo.Armaduras.Yelmo;

public interface FabricaAbstracta {

    public Yelmo crearYelmo();

    public Peto crearPeto();

    public Greba crearGrebas();
    
    public Escarpe crearEscarpe();
}