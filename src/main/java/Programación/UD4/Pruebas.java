package Programación.UD4;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Pruebas {
      public static void main(String[] args) {
        String texto = "";
        texto = texto.toUpperCase();
        System.out.println(texto);
        double n = 500.45;

          DecimalFormat f = new DecimalFormat( "00000,00%");
        System.out.println(f.format(n));

          String var1 = "";
          Scanner ent = new Scanner(System.in);
          System.out.print("Escribe un dato");
          var1 = ent.nextLine();

          System.out.println("Contenido de var1" + var1);

          System.out.print("Contenido de n; " + n);
          n = ent.nextDouble();
          System.out.print("Contenido de n; " + n);

      }
}
