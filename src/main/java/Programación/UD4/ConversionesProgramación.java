package Programación.UD4;

public class ConversionesProgramación {
    public static void main(String[] args) {
        int c = (int) 14.56789;
        boolean encontrado = true;

        //No acosejable utilizar estas
        //String v1 = "" + 'a'; // v1 es a
        //String v2 = "" + 'b'; // v2 es 848
        //String v3 = "" + '23.78; // v3 es 23.78F


        //Estas si
        String v1 = String.valueOf('a'); //v1 es a
        String v2 = String.valueOf(848); //v2 es 848
        String v3 = String.valueOf(23.78); //v3 es 23.78F
        String v4 = String.valueOf(encontrado); //v4 es true

        //No se puede convertir String a Char, pero sí extraer caracteres
        String var10 = "HOLA COMO ESTAS";
        System.out.println(var10.length());
        char v = "Viernes".charAt(0); //v es 'V'
        char l = "Lunes".charAt(4); //l es 's'
        System.out.println("Ejemplo charAt: " + v + " " + l);


        //parseInt() y parseFloat()
        String n1 = "213";
        int n11 = Integer.parseInt(n1); //n11 es 213

        String n2 = "23.78";
        float n22 = Float.parseFloat(n2); //n22 es 23.78F
        System.out.println("Ejemplo parseInt: " + n11 + "Y parsefloat: " + n22);

    }
}
