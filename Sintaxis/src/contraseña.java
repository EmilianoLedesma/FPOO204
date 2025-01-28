
import java.util.Scanner;

public class contraseña {

    public static void main(String[] args) {
        String contra = "Wakanda";
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la contraseña: ");
        String contraU = sc.nextLine();

        if (contra.equals(contraU)) {
            System.out.println("La contraseña es correcta.");
        } else {
            System.out.println("La contraseña es incorrecta.");
        }

    }
}
