public class Cuenta {
    private String numeroCuenta;
    private String titular;
    private int edad;
    private double saldo;

    // Constructor completo
    public Cuenta(String numeroCuenta, String titular, int edad, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.edad = edad;
        this.saldo = saldo;
    }

    // Constructor sin saldo inicial
    public Cuenta(String numeroCuenta, String titular, int edad) {
        this(numeroCuenta, titular, edad, 0.0);
    }

    // Métodos encapsulados
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

    // Getters y setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
