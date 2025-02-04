
import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();

        while (num != 1) {
            System.out.print(num + ", ");
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = 3 * num + 1;
            }
        }
        System.out.println(num);
    }
}
