
import java.util.Scanner;

public class clientes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un tu edad: ");
        int num = sc.nextInt();

        if (num < 4) {
            System.out.println("La entrada es gratis.");
        } else if (num >= 4 && num <= 18) {
            System.out.println("El precio de la entrada es $110.");
        } else {
            System.out.println("El precio de la entrada es $190.");
        }
    }
}
