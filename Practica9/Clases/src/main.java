
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        // Crear una cuenta
        String numeroCuenta1 = JOptionPane.showInputDialog("Ingrese el número de cuenta:");
        String titular1 = JOptionPane.showInputDialog("Ingrese el nombre del titular:");
        int edad1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del titular:"));
        double saldo1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo inicial:"));
        Cuenta cuenta1 = new Cuenta(numeroCuenta1, titular1, edad1, saldo1);

        // Crear otra cuenta para transferencia
        String numeroCuenta2 = JOptionPane.showInputDialog("Ingrese el número de la otra cuenta:");
        String titular2 = JOptionPane.showInputDialog("Ingrese el nombre del titular de la otra cuenta:");
        int edad2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del titular de la otra cuenta:"));
        double saldo2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo inicial de la otra cuenta:"));
        Cuenta cuenta2 = new Cuenta(numeroCuenta2, titular2, edad2, saldo2);

        Cuenta cuentaActual = cuenta1;

        while (true) {
            String[] options = {"Consultar información de cuenta", "Ingresar efectivo", "Retirar efectivo", "Depositar a otra cuenta", "Cambiar de cuenta", "Salir"};
            int choice = JOptionPane.showOptionDialog(null, "Cuenta actual: " + cuentaActual.getTitular() + "\nSeleccione una operación", "Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Titular: " + cuentaActual.getTitular() + "\nNúmero de Cuenta: " + cuentaActual.getnumCuenta() + "\nEdad: " + cuentaActual.getEdad() + "\nSaldo actual: " + cuentaActual.consultarSaldo());
                    break;
                case 1:
                    double ingreso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));
                    cuentaActual.ingresarEfectivo(ingreso);
                    JOptionPane.showMessageDialog(null, "Saldo después del ingreso: " + cuentaActual.consultarSaldo());
                    break;
                case 2:
                    double retiro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a retirar:"));
                    if (retiro > cuentaActual.consultarSaldo()) {
                        JOptionPane.showMessageDialog(null, "Error: El retiro excede el saldo disponible.");
                    } else {
                        cuentaActual.retirarEfectivo(retiro);
                        JOptionPane.showMessageDialog(null, "Saldo después del retiro: " + cuentaActual.consultarSaldo());
                    }
                    break;
                case 3:
                    double deposito = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a depositar a otra cuenta:"));
                    if (deposito > cuentaActual.consultarSaldo()) {
                        JOptionPane.showMessageDialog(null, "Error: El depósito excede el saldo disponible.");
                    } else {
                        cuentaActual.depositarOtraCuenta(cuentaActual == cuenta1 ? cuenta2 : cuenta1, deposito);
                        JOptionPane.showMessageDialog(null, "Saldo después del depósito en cuenta actual: " + cuentaActual.consultarSaldo());
                        JOptionPane.showMessageDialog(null, "Saldo después del depósito en otra cuenta: " + (cuentaActual == cuenta1 ? cuenta2.consultarSaldo() : cuenta1.consultarSaldo()));
                    }
                    break;
                case 4:
                    cuentaActual = (cuentaActual == cuenta1) ? cuenta2 : cuenta1;
                    JOptionPane.showMessageDialog(null, "Cuenta cambiada a: " + cuentaActual.getTitular());
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
