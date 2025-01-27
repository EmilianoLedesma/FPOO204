
import java.util.Scanner;

public class Nombre_al_reves {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        StringBuilder nombreback = new StringBuilder(nombre);
        System.out.println(nombreback.reverse());
    }
}
