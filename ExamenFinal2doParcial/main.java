package ExamenFinal2doParcial;

import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) throws Exception {
        while (true) {
            String[] options = {
                "Convertir romano a arabigo", "Convertir arabigo a romano", "Salir"
            };
            int choice = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    convertidor_rom_arab convertidor = new convertidor_rom_arab();
                    JOptionPane.showMessageDialog(null, "El numero convertido es: " + convertidor.convertidor_arab());
                    break;
                case 1:
                    convertidor_arab_rom convertidor2 = new convertidor_arab_rom();
                    JOptionPane.showMessageDialog(null, "El numero convertido es: " + convertidor2.convertidor_rom());
                    break;
                case 2:
                    System.exit(0);
                    break;
            }
        }
    }
}
