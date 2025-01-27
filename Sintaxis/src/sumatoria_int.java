
import java.util.Scanner;

public class sumatoria_int {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int num = scanner.nextInt();

        int sum = 0;
        System.out.print("La suma ingresada es: ");
        for (int i = 1; i <= num; i++) {
            sum += i;
            System.out.print(i);
            if (i < num) {
                System.out.print(" + ");
            }
        }
        System.out.println("\nLa suma de todos los enteros desde 1 hasta " + num + " es: " + sum);

        scanner.close();
    }
}
