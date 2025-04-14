package ExamenFinal2doParcial;

import javax.swing.JOptionPane;

public class convertidor_rom_arab {

    private String num_rom;
    private static String romano[] = {"I", "V", "X", "L"};

    public convertidor_rom_arab() {
        this.num_rom = JOptionPane.showInputDialog("Ingrese el número romano: ").toUpperCase();
    }

    public String getnum_rom() {
        return num_rom;
    }

    public String setnum_rom(String num_rom) {
        this.num_rom = num_rom;
        return num_rom;
    }

    public int convertidor_arab() {
        int num_arab = 0;
        int num_rom_len = num_rom.length();
        if (num_rom_len > 3) {
            JOptionPane.showMessageDialog(null, "Error");
        } else {
            for (int i = 0; i < num_rom_len; i++) {
                char c = num_rom.charAt(i);
                int value = 0;
                switch (c) {
                    case 'I':
                        value = 1;
                        break;
                    case 'V':
                        value = 5;
                        break;
                    case 'X':
                        value = 10;
                        break;
                    case 'L':
                        value = 50;
                        break;
                }
                if (i + 1 < num_rom_len) {
                    char nextChar = num_rom.charAt(i + 1);
                    if (nextChar == 'V' || nextChar == 'X') {
                        if (c == 'I') {
                            value = -1;
                        }
                    } else if (nextChar == 'L' || nextChar == 'C') {
                        if (c == 'X') {
                            value = -10;
                        }
                    }
                }
                num_arab += value;
            }
            if (num_arab > 50) {
                JOptionPane.showMessageDialog(null, "Error, el numero no puede ser mayor a 50");
            }
        }
        return num_arab;
    }
}
