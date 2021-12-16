package Codigo.Armaduras;

public class Personaje {

    private static Personaje instancia;
    private String armadura;

    private Personaje(){
        armadura = null;
    }

    public static Personaje getInstancia() {
        if (instancia == null) {
            instancia = new Personaje();
        }
        return instancia;
    }

    public String getArmadura() {
        return armadura;
    }

    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }
    
    
}


