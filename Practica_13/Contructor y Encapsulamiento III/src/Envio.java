
import javax.swing.JOptionPane;

public class Envio {

    private String codigoEnvio;
    private String destino;
    private double peso;
    private String estado;

    public Envio(String codigoEnvio, String destino) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.estado = "Pendiente";
    }

    public Envio(String codigoEnvio, String destino, double peso) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = peso;
        this.estado = "Pendiente";
    }

    public String getCodigoEnvio() {
        return codigoEnvio;
    }

    public void setCodigoEnvio(String codigoEnvio) {
        this.codigoEnvio = codigoEnvio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstado() {
        return estado;
    }

    public void actualizarEstado(String nuevoEstado) {
        if (nuevoEstado.equals("En tránsito") || nuevoEstado.equals("Entregado")) {
            this.estado = nuevoEstado;
        } else {
            JOptionPane.showMessageDialog(null, "Estado no válido. Solo se permite 'En tránsito' o 'Entregado'.");
        }
    }

    public static Envio crearEnvio() {
        String codigoEnvio = JOptionPane.showInputDialog("Ingrese el código del envío:");
        String destino = JOptionPane.showInputDialog("Ingrese el destino del envío:");
        String pesoStr = JOptionPane.showInputDialog("Ingrese el peso del envío en kilogramos (opcional):");
        if (pesoStr.isEmpty()) {
            return new Envio(codigoEnvio, destino);
        } else {
            double peso = Double.parseDouble(pesoStr);
            return new Envio(codigoEnvio, destino, peso);
        }
    }
}
