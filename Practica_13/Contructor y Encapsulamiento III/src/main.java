
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) throws Exception {
        List<Vehiculo> vehiculos = new ArrayList<>();
        List<Conductor> conductores = new ArrayList<>();
        List<Envio> envios = new ArrayList<>();

        while (true) {
            String[] options = {
                "Crear Vehículo", "Crear Conductor", "Asignar Conductor a Vehículo",
                "Registrar Envío", "Actualizar Estado Envío",
                "Mostrar Información", "Mostrar Información por Número de Guía", "Salir"
            };
            int choice = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    Vehiculo vehiculo = new Vehiculo();
                    vehiculos.add(vehiculo);
                    JOptionPane.showMessageDialog(null, "Vehículo creado: " + vehiculo.getPlaca());
                    break;
                case 1:
                    Conductor conductor = new Conductor();
                    conductores.add(conductor);
                    JOptionPane.showMessageDialog(null, "Conductor creado: " + conductor.getNombre());
                    break;
                case 2:
                    if (vehiculos.isEmpty() || conductores.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay vehículos o conductores disponibles.");
                        break;
                    }
                    String[] placas = new String[vehiculos.size()];
                    for (int i = 0; i < vehiculos.size(); i++) {
                        placas[i] = vehiculos.get(i).getPlaca();
                    }
                    String placaVehiculo = (String) JOptionPane.showInputDialog(null, "Seleccione la placa del vehículo:", "Asignar Conductor", JOptionPane.QUESTION_MESSAGE, null, placas, placas[0]);
                    vehiculo = null;
                    for (Vehiculo v : vehiculos) {
                        if (v.getPlaca().equals(placaVehiculo)) {
                            vehiculo = v;
                            break;
                        }
                    }
                    if (vehiculo == null) {
                        JOptionPane.showMessageDialog(null, "Vehículo no encontrado.");
                        break;
                    }
                    String[] nombresConductores = new String[conductores.size()];
                    for (int i = 0; i < conductores.size(); i++) {
                        nombresConductores[i] = conductores.get(i).getNombre();
                    }
                    String nombreConductor = (String) JOptionPane.showInputDialog(null, "Seleccione el nombre del conductor:", "Asignar Conductor", JOptionPane.QUESTION_MESSAGE, null, nombresConductores, nombresConductores[0]);
                    conductor = null;
                    for (Conductor c : conductores) {
                        if (c.getNombre().equals(nombreConductor)) {
                            conductor = c;
                            break;
                        }
                    }
                    if (conductor == null) {
                        JOptionPane.showMessageDialog(null, "Conductor no encontrado.");
                        break;
                    }
                    vehiculo.asignarConductor(conductor);
                    break;
                case 3:
                    Envio envio = Envio.crearEnvio();
                    envios.add(envio);
                    JOptionPane.showMessageDialog(null, "Envío creado: " + envio.getCodigoEnvio());
                    break;
                case 4:
                    if (envios.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay envíos registrados.");
                        break;
                    }
                    String[] codigosEnvio = new String[envios.size()];
                    for (int i = 0; i < envios.size(); i++) {
                        codigosEnvio[i] = envios.get(i).getCodigoEnvio();
                    }
                    String codigoEnvio = (String) JOptionPane.showInputDialog(null, "Seleccione el código del envío:", "Actualizar Estado Envío", JOptionPane.QUESTION_MESSAGE, null, codigosEnvio, codigosEnvio[0]);
                    envio = null;
                    for (Envio e : envios) {
                        if (e.getCodigoEnvio().equals(codigoEnvio)) {
                            envio = e;
                            break;
                        }
                    }
                    if (envio == null) {
                        JOptionPane.showMessageDialog(null, "Envío no encontrado.");
                        break;
                    }
                    String nuevoEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado del envío:");
                    envio.actualizarEstado(nuevoEstado);
                    JOptionPane.showMessageDialog(null, "Estado del envío actualizado a: " + envio.getEstado());
                    break;
                case 5:
                    String info = "Información del sistema:\n\nVehículos:\n";
                    for (Vehiculo v : vehiculos) {
                        info += "Placa: " + v.getPlaca() + ", Modelo: " + v.getModelo() + ", Capacidad de Carga: " + v.getCapacidadCarga() + "\n";
                        if (v.getConductor() != null) {
                            info += "  Conductor: " + v.getConductor().getNombre() + "\n";
                        }
                    }
                    info += "\nConductores:\n";
                    for (Conductor c : conductores) {
                        info += "Nombre: " + c.getNombre() + ", Identificación: " + c.getIdentificacion() + ", Licencia: " + c.getLicencia() + "\n";
                    }
                    info += "\nEnvíos:\n";
                    for (Envio e : envios) {
                        info += "Código: " + e.getCodigoEnvio() + ", Destino: " + e.getDestino() + ", Peso: " + e.getPeso() + ", Estado: " + e.getEstado() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, info);
                    break;
                case 6:
                    if (envios.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay envíos registrados.");
                        break;
                    }
                    codigosEnvio = new String[envios.size()];
                    for (int i = 0; i < envios.size(); i++) {
                        codigosEnvio[i] = envios.get(i).getCodigoEnvio();
                    }
                    String codigoEnvioSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione el número de guía del envío:", "Mostrar Información por Número de Guía", JOptionPane.QUESTION_MESSAGE, null, codigosEnvio, codigosEnvio[0]);
                    envio = null;
                    for (Envio e : envios) {
                        if (e.getCodigoEnvio().equals(codigoEnvioSeleccionado)) {
                            envio = e;
                            break;
                        }
                    }
                    if (envio == null) {
                        JOptionPane.showMessageDialog(null, "Envío no encontrado.");
                        break;
                    }
                    String envioInfo = "Información del Envío:\n";
                    envioInfo += "Código: " + envio.getCodigoEnvio() + "\n";
                    envioInfo += "Destino: " + envio.getDestino() + "\n";
                    envioInfo += "Peso: " + envio.getPeso() + "\n";
                    envioInfo += "Estado: " + envio.getEstado() + "\n";
                    JOptionPane.showMessageDialog(null, envioInfo);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
