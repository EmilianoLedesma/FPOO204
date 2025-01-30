
import java.util.Scanner;

public class tablas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero positivo: ");
        int num = sc.nextInt();
        for (int j = 1; j <= 10; j++) {
            System.out.println("Tabla de multiplicar del " + num);
            System.out.println(num + " x " + j + " = " + (num * j));
        }
        System.out.println();
    }
}
