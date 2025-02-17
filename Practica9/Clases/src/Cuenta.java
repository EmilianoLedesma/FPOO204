
public class Cuenta {

    private String numeroCuenta;
    private String titular;
    private int edad;
    private double saldo;

    public Cuenta(String numeroCuenta, String titular, int edad, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.edad = edad;
        this.saldo = saldo;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void ingresarEfectivo(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public void retirarEfectivo(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        }
    }

    public void depositarOtraCuenta(Cuenta otraCuenta, double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            this.retirarEfectivo(cantidad);
            otraCuenta.ingresarEfectivo(cantidad);
        }
    }

    public String getTitular() {
        return titular;
    }

    public int getEdad() {
        return edad;
    }

    public String getnumCuenta() {
        return numeroCuenta;
    }
}
