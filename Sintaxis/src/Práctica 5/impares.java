
import java.util.Scanner;

public class impares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int num = sc.nextInt();

        if (num > 0) {
            for (int i = 1; i <= num; i += 2) {
                if (i > 1) {
                    System.out.print(", ");
                }
                System.out.print(i);
            }
        } else {
            System.out.println("El número debe ser entero positivo.");
        }
    }
}
