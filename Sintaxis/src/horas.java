
import java.util.Scanner;

public class horas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.print("Introduce el coste por hora: ");
        double costePorHora = scanner.nextDouble();

        double paga = horasTrabajadas * costePorHora;

        System.out.println("La paga que le corresponde es: " + paga);
    }
}
