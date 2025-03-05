
public class Spartan extends Soldado {

    private int escudo;

    public Spartan(String nombre, int salud, String arma, int escudo) {
        super(nombre, salud, arma);
        this.escudo = escudo;
    }

    public void recargarEscudo() {
        escudo = 100;
        System.out.println("El Spartan " + nombre + " recargo su escudo");
    }

    @Override
    public void recibirDaño(int daño) {
        if (escudo > 0) {
            escudo -= daño;
            if (escudo <= 0) {
                salud += escudo;
                escudo = 0;
            }
            System.out.println("El Spartan " + nombre + " recibio daño. Ahora tiene " + escudo + " de escudo y " + salud + " de salud");
        } else {
            super.recibirDaño(daño);
        }
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Escudo: " + this.escudo);
    }

}
