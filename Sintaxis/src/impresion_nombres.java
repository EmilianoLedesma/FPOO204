
import java.util.Scanner;

public class impresion_nombres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce tu apellido paterno: ");
        String ap1 = scanner.nextLine();

        System.out.print("Introduce tu apellido materno: ");
        String ap2 = scanner.nextLine();

        String nombreminus = nombre;
        String nombremayus = nombre;
        String nombremix = nombre;

        String ap1minus = ap1;
        String ap1mayus = ap1;
        String ap2minus = ap2;
        String ap2mayus = ap2;
        String ap1mix = ap1;
        String ap2mix = ap2;

        nombremayus = nombre.toUpperCase();
        nombreminus = nombre.toLowerCase();
        nombremix = nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase();

        ap1mayus = ap1.toUpperCase();
        ap2mayus = ap2.toUpperCase();
        ap1minus = ap2minus.toLowerCase();
        ap2minus = ap2minus.toLowerCase();
        ap1mix = ap1.substring(0, 1).toUpperCase() + ap1.substring(1).toLowerCase();
        ap2mix = ap2.substring(0, 1).toUpperCase() + ap2.substring(1).toLowerCase();

        System.out.println(nombremayus + " " + ap1mayus + " " + ap2mayus);
        System.out.println(nombreminus + " " + ap2minus + " " + ap2minus);
        System.out.println(nombremix + " " + ap1mix + " " + ap2mix);

    }
}
