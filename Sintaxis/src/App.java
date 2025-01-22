// IMPORTACIONES

public class App {

    //Método Main
    /*Soy
     * Un
     * Chivista de corazon
     * arriba las chivas
     */
    public static void main(String[] args) throws Exception {
        /*
        String cadenas = "Emiliano" + " Ledesma" + " Ledesma";

        System.out.println(cadenas);
        System.out.println(cadenas.length());
        //Extraer información de cadenas
        System.out.println(cadenas.substring(2, 5));
        System.out.println(cadenas.substring(2));
        System.out.println(cadenas.substring(0, 5));
         */
 /*
         *         int x = 5, x2;
        double y = 1.25, y2;
        String z = "204", z1;

        //Conversion de cadena a int
        x2 = Integer.parseInt(z);
        //Conversion de double a cadena
        z1 = String.valueOf(y);
        //Conversion de int a double
        double asd = Double.valueOf(x);

        //Conversion implicita
        int num = 12;
        double num0 = num;
        System.out.println("Conversion Implicita " + num0);

        System.out.println(x2);
        System.out.println(z1);
        System.out.println(asd);

        //Creacion de objeto de clase aleatorio
        Random rdn = new Random();

        //Generar un numero aleatorio
        int numAleatorio = rdn.nextInt(0, 10);
        double numAleatorio2 = rdn.nextDouble(0, 10);

        System.err.println("Aleatorio entero: " + numAleatorio);
        System.err.println("Aleatorio double: " + numAleatorio2);

        //Lectura de datos
        Scanner scn = new Scanner(System.in);

        System.out.println("Introduce cualquier dato");
        String dato = scn.nextLine();

        System.out.println("Introduce un dato entero");
        int datoentero = scn.nextInt();

        System.out.println("Introduce un dato con decimales");
        double datodecimal = scn.nextDouble();

        //Imprime los datos ingresados
        System.out.println("Dato ingresado: " + dato);
        System.out.println("Dato entero ingresado: " + datoentero);
        System.out.println("Dato decimal ingresado: " + datodecimal);

         */

        //Boolean, operadores logicos y de comparacion
        System.out.println(10 > 9);
        System.out.println(10 == 9);
        System.out.println(10 < 9);
        System.out.println(10 >= 9);
        System.out.println(10 <= 9);
        System.out.println(10 != 9);

        int x = 3;
        System.out.println(x < 5 && x > 10);
        System.out.println(x < 5 || x > 10);
        System.out.println(!(x < 5 && x > 10));
    
    }
}
