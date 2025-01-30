
import java.util.Scanner;

public class regresiva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int num = sc.nextInt();

        if (num > 0) {
            for (int i = num; i >= 0; i--) {
                if (i > 1) {
                }
                System.out.println(i);
            }
        }
    }
}
