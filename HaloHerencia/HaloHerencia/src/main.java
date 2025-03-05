
public class main {

    public static void main(String[] args) {
        SpartanII jefeMaestro = new SpartanII("John", 100, "agijoneadora", 0);
        jefeMaestro.mostrarInfo();
        jefeMaestro.usarManejoAvanzado();
        jefeMaestro.atacar("Pozole");
        jefeMaestro.recibirDaño(200);
        jefeMaestro.recargarEscudo();

        System.out.println("----------------------------------------------------------------------------");

        SpartanIII Jorge = new SpartanIII("Jorge", 100, "lanzacohetes", 0);
        Jorge.mostrarInfo();
        Jorge.camuflajeActivo();
        Jorge.atacar("Pozole");
        Jorge.recibirDaño(300);
        Jorge.recargarEscudo();

        System.out.println("----------------------------------------------------------------------------");

        SpartanIV Pozole = new SpartanIV("Pozole", 100, "Ametralladora", 0);
        Pozole.mostrarInfo();
        Pozole.usaPropulsores();
        Pozole.atacar("John");
        Pozole.recibirDaño(500);
        Pozole.recargarEscudo();
    }
}
