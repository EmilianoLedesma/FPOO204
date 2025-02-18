
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        int longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de la contraseña (8 por defecto):", "8"));
        boolean incluirMayusculas = JOptionPane.showConfirmDialog(null, "¿Desea incluir mayúsculas?", "Opciones", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        boolean incluirCaracteresEspeciales = JOptionPane.showConfirmDialog(null, "¿Desea incluir caracteres especiales?", "Opciones", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

        GeneradorContraseñas generador = new GeneradorContraseñas(longitud, incluirMayusculas, incluirCaracteresEspeciales);
        String contraseña = generador.generarContraseña();
        String fortaleza = generador.verificarFortaleza(contraseña);

        JOptionPane.showMessageDialog(null, "Contraseña generada: " + contraseña + "\nFortaleza de la contraseña: " + fortaleza);
    }
}
