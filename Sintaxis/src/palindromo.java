
import java.util.Scanner;

public class palindromo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena de caracteres:");
        String input = sc.nextLine();

        if (esPalindromo(input)) {
            System.out.println("La cadena " + input + " es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }
    }

    public static boolean esPalindromo(String cadena) {
        cadena = cadena.toLowerCase();
        String invertida = new StringBuilder(cadena).reverse().toString();
        return invertida.equals(cadena);
    }
}
