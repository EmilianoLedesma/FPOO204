
import javax.swing.JOptionPane;

public class Vehiculo {

    private String placa;
    private String modelo;
    private double capacidadCarga;
    private Conductor conductor;

    public Vehiculo() {
        this.placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
        this.modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
        this.capacidadCarga = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad de carga del vehículo en litros:"));
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void asignarConductor(Conductor conductor) {
        if (this.conductor == null) {
            this.conductor = conductor;
        } else {
            JOptionPane.showMessageDialog(null, "El conductor ya ha sido asignado y no puede ser modificado.");
        }
    }
}
