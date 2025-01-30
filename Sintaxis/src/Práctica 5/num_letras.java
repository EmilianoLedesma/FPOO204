
import java.util.Scanner;

public class num_letras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine().toLowerCase();

        System.out.print("Introduce una letra: ");
        char letra = sc.next().toLowerCase().charAt(0);

        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                cont++;
            }
        }

        System.out.println("La letra '" + letra + "' aparece " + cont + " veces en la frase.");
    }
}
