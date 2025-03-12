
import java.util.Random;
import javax.swing.JOptionPane;

public class Generador {

    private String nombre;
    private String apellidoPat;
    private String apellidoMat;
    private int nacimiento;
    private int ano;
    private String carrera;
    private int num;

    public Generador() {
        this.nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona:");
        this.apellidoPat = JOptionPane.showInputDialog("Ingrese el apellido paterno de la persona:");
        this.apellidoMat = JOptionPane.showInputDialog("Ingrese el apellido materno de la persona:");
        this.nacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de nacimiento de la persona:"));
        this.ano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año en curso:"));
        this.carrera = JOptionPane.showInputDialog("Ingrese la carrera de la persona:");
        this.num = generarNumeroAleatorio();
    }

    private int generarNumeroAleatorio() {
        Random random = new Random();
        return 100 + random.nextInt(900);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String generarMatricula() {
        String matricula = carrera.substring(0, 3).toUpperCase()
                + String.valueOf(ano).substring(2, 4)
                + String.valueOf(nacimiento).substring(2, 4)
                + nombre.substring(0, 1).toUpperCase()
                + apellidoPat.substring(0, 3).toUpperCase()
                + apellidoMat.substring(0, 3).toUpperCase()
                + String.valueOf(num).substring(0, 3);
        return matricula;
    }
}
