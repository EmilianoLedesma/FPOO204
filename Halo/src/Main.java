
public class Main {

    public static void main(String[] args) {
        //Instanciar un objeto de la clase Spartan
        Spartan JailoVerde = new Spartan();
        Spartan JailoNaranja = new Spartan();
        //Asignar valores a los atributos del objeto
        JailoVerde.nombre = "John 117";
        JailoVerde.salud = 100;
        JailoVerde.escudo = 100;
        JailoVerde.ArmaPrincipal = "Aguijoneador";

        JailoNaranja.nombre = "Jorge";
        JailoNaranja.salud = 0;
        JailoNaranja.escudo = 0;
        JailoNaranja.ArmaPrincipal = "Lanzacohetes";

        //Llamar a los metodos del objeto
        JailoVerde.mostrarInfo();
        JailoVerde.atacar("Elite: Pozole");
        JailoVerde.recargarArma(30);
        JailoVerde.correr(true);

        JailoNaranja.mostrarInfo();
        JailoNaranja.atacar("Elite: Pozole");
        JailoNaranja.recargarArma(10);
        JailoNaranja.correr(false);

    }
}
