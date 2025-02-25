
import java.security.SecureRandom;

public class GeneradorContraseñas {

    private int longitud;
    private boolean incluirMayusculas;
    private boolean incluirCaracteresEspeciales;
    private static String minusculas = "abcdefghijklmnopqrstuvwxyz";
    private static String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String especiales = "!@#$%^&*()-_=+[]{}|;:',.<>?/";

    public GeneradorContraseñas(int longitud, boolean incluirMayusculas, boolean incluirCaracteresEspeciales) {
        this.longitud = longitud;
        this.incluirMayusculas = incluirMayusculas;
        this.incluirCaracteresEspeciales = incluirCaracteresEspeciales;
    }

    // Encapsuladores
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean isIncluirMayusculas() {
        return incluirMayusculas;
    }

    public void setIncluirMayusculas(boolean incluirMayusculas) {
        this.incluirMayusculas = incluirMayusculas;
    }

    public boolean isIncluirCaracteresEspeciales() {
        return incluirCaracteresEspeciales;
    }

    public void setIncluirCaracteresEspeciales(boolean incluirCaracteresEspeciales) {
        this.incluirCaracteresEspeciales = incluirCaracteresEspeciales;
    }

    public String generarContraseña() {
        SecureRandom random = new SecureRandom();
        String conjuntoCaracteres = minusculas;

        if (incluirMayusculas) {
            conjuntoCaracteres += MAYUSCULAS;
        }
        if (incluirCaracteresEspeciales) {
            conjuntoCaracteres += especiales;
        }

        char[] contraseña = new char[longitud];
        for (int i = 0; i < longitud; i++) {
            contraseña[i] = conjuntoCaracteres.charAt(random.nextInt(conjuntoCaracteres.length()));
        }

        return new String(contraseña);
    }

    public String verificarFortaleza(String contraseña) {
        int puntuacion = 0;
        if (contraseña.length() >= 8) {
            puntuacion++;
        }
        if (contraseña.matches(".*[A-Z].*")) {
            puntuacion++;
        }
        if (contraseña.matches(".*[a-z].*")) {
            puntuacion++;
        }
        if (contraseña.matches(".*[0-9].*")) {
            puntuacion++;
        }
        if (contraseña.matches(".*[!@#$%^&*()-_=+\\[\\]{}|;:'\",.<>?/].*")) {
            puntuacion++;
        }

        switch (puntuacion) {
            case 5:
                return "Muy fuerte";
            case 4:
                return "Fuerte";
            case 3:
                return "Moderada";
            default:
                return "Débil";
        }
    }
}
