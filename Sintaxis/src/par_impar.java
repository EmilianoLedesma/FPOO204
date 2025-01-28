
import java.util.Scanner;

public class par_impar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número ingresado es par");
        } else {
            System.out.println("El número ingresado es impar");
        }
    }
}
