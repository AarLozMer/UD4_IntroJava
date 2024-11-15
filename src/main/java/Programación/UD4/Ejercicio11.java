package Programación.UD4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.print("Introduce un valor para el radio: ");
        double r = input.nextDouble();
        System.out.print("Introduce un valor para la altura: ");
        double h = input.nextDouble();
        double area = Math.PI * Math.pow(r, 2) * Math.pow(h, 2);
        double longitud = 2 * Math.PI * r;
        double volumen = h * Math.PI * Math.pow(r, 2);
        System.out.println("El area es: " + df.format(area));
        System.out.println("La longitud es: " + longitud);
        System.out.println("El volumen es: " + volumen);

    }
}
