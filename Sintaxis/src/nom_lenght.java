
import java.util.Scanner;

public class nom_lenght {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        String nombreMayus = nombre.toUpperCase();
        int longitud = nombre.length();

        System.out.println(nombreMayus + " tiene " + longitud + " letras.");
    }
}
