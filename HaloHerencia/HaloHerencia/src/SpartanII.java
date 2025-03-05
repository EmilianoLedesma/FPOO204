
public class SpartanII extends Spartan {

    public SpartanII(String nombre, int salud, String arma, int escudo) {
        super(nombre, salud, arma, 150);
    }

    public void usarManejoAvanzado() {
        System.out.println("El Spartan " + nombre + " tiene escudo extra y tacticas avanzadas de combate avanzadas");

    }
}
