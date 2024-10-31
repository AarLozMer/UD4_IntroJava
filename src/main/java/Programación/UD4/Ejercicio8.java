package Programación.UD4;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Escribe un valor para el radio: ");
        double r = input.nextFloat();
        System.out.print("Escribe un valor para la altura: ");
        double h = input.nextFloat();
        double volumen = 0.33 * Math.PI * Math.pow(r, 2) * h;
        System.out.print("El volumen del cono es: " + volumen);


    }
}
