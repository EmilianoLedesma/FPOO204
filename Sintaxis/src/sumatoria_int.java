
import java.util.Scanner;

public class sumatoria_int {

    /*Escribir un programa que solicite un entero X, introducido por el usuario y
después muestre en pantalla la suma de todos los enteros desde 1 hasta X . */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int num = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("La suma de todos los enteros desde 1 hasta " + num + " es: " + sum);

    }
}
