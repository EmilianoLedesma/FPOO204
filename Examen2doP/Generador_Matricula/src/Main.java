import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) throws Exception {

        List<Generador> personas = new ArrayList<>();

        while (true) {
            String[] options = {"Registrar Estudiante", "Obtener matricula", "Salir", "Mostrar todas las personas registradas"};
            int choice = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    Generador Persona = new Generador();
                    personas.add(Persona);
                    JOptionPane.showMessageDialog(null, "Estudiante registrado correctamente");
                    break;
                case 1:
                    if (personas.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay estudiantes registrados.");
                    } else {
                        Generador generador = personas.get(personas.size() - 1);
                        String matricula = generador.generarMatricula();
                        JOptionPane.showMessageDialog(null, "La matrícula es: " + matricula);
                    }
                    break;

                case 2:
                    System.exit(0);
                    break;

                case 3:
                    if (personas.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay estudiantes registrados.");
                    } else {
                        StringBuilder sb = new StringBuilder("Personas registradas:\n");
                        for (Generador persona : personas) {
                            sb.append(persona.getNombre()).append("\n");
                            sb.append(persona.getApellidoPat()).append("\n");
                            sb.append(persona.getApellidoMat()).append("\n");
                            sb.append(persona.getNacimiento()).append("\n");
                            sb.append(persona.getAno()).append("\n");
                            sb.append(persona.getCarrera()).append("\n");
                            sb.append("Matricula: ").append(persona.generarMatricula()).append("\n\n");
                        }
                        JOptionPane.showMessageDialog(null, sb.toString());
                        break;
                    }
            }
        }
    }
}
