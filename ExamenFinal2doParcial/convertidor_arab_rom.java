package ExamenFinal2doParcial;

import javax.swing.JOptionPane;

public class convertidor_arab_rom {

    private int num_arab;

    public convertidor_arab_rom() {
        this.num_arab = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero arabigo: "));
    }

    public int getnum_arab() {
        return num_arab;
    }

    public int setnum_arab(int num_arab) {
        this.num_arab = num_arab;
        return num_arab;
    }

    public String convertidor_rom() {
        StringBuilder num_rom = new StringBuilder();
        int num = num_arab;
        while (num >= -50) {
            if (num >= 50) {
                JOptionPane.showMessageDialog(null, "Error, el numero no puede ser mayor a 50");
                break;
            } else if (num == 50) {
                num_rom.append("L");
                num -= 50;
            } else if (num >= 40) {
                num_rom.append("XL");
                num -= 40;
            } else if (num >= 10) {
                num_rom.append("X");
                num -= 10;
            } else if (num >= 9) {
                num_rom.append("IX");
                num -= 9;
            } else if (num >= 5) {
                num_rom.append("V");
                num -= 5;
            } else if (num >= 4) {
                num_rom.append("IV");
                num -= 4;
            } else if (num >= 1) {
                num_rom.append("I");
                num -= 1;
            } else if (num <= 0) {
                JOptionPane.showMessageDialog(null, "Error, el numero no puede ser menor a 1");
                break;
            }
        }
        return String.valueOf(num_rom);
    }
}
