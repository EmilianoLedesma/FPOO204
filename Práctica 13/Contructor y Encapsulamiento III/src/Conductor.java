
import javax.swing.JOptionPane;

public class Conductor {

    private String nombre;
    private String identificacion;
    private String licencia;

    public Conductor() {
        this.nombre = JOptionPane.showInputDialog("Ingrese el nombre del conductor:");
        this.identificacion = JOptionPane.showInputDialog("Ingrese la identificación del conductor:");
        this.licencia = JOptionPane.showInputDialog("Ingrese la licencia del conductor:");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getLicencia() {
        return licencia;
    }
}
