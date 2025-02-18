package Sintaxis.src.Practica_8;

public class main {

    public static void main(String[] args) {
        Spartan spartan1 = new Spartan();
        spartan1.nombre = "Master Chief";
        spartan1.salud = 100;
        spartan1.escudo = 100;
        spartan1.ArmaPrincipal = "Rifle de asalto";

        spartan1.mostrarInfo();
        spartan1.atacar("Elite");
        spartan1.recargarArma(10);
        spartan1.correr(true);
    }
}
