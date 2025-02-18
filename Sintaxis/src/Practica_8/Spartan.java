
public class Spartan {

    //Atributos
    public String nombre; //Se puede omitir el public, si no se pone, lo toma como publico en automatico
    int salud;
    int escudo;
    public String ArmaPrincipal;

    //metodods
    public void mostrarInfo() {
        System.out.println("-------Informacion del Spartan--------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salud: " + salud);
        System.out.println("Escudo: " + escudo);
        System.out.println("Arma Principal: " + ArmaPrincipal);
        System.out.println("--------------------------------------");
    }

    public void atacar(String enemigo) {
        System.out.println("El Spartan " + nombre + " a atacado al enemigo " + enemigo + " con el arma " + ArmaPrincipal);
    }

    public void recargarArma(int municiones) {
        int restante = 10;
        int total = restante + municiones;
        System.out.println("El Spartan " + nombre + " a recargado su arma " + ArmaPrincipal + " con " + municiones + " municiones. Ahora tiene un total de " + total + " municiones");
    }

    public void correr(boolean estatus) {
        if (estatus) {
            System.out.println("El Spartan " + nombre + " esta corriendo");
        } else {
            System.out.println("El Spartan " + nombre + " se ha detenido");
        }
    }

}
