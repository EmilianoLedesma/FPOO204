
import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingrese un operador: suma(1), resta(2), multiplicación(3), división(4): ");
        char operador = scanner.next().charAt(0);

        double resultado;

        switch (operador) {
            case '1':
                resultado = num1 + num2;
                System.out.println("El resultado es: " + resultado);
                break;
            case '2':
                resultado = num1 - num2;
                System.out.println("El resultado es: " + resultado);
                break;
            case '3':
                resultado = num1 * num2;
                System.out.println("El resultado es: " + resultado);
                break;
            case '4':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("El resultado es: " + resultado);
                } else {
                    System.out.println("Error: División por cero.");
                }
                break;
            default:
                System.out.println("Error: Operador no válido.");
                break;
        }

    }
}
