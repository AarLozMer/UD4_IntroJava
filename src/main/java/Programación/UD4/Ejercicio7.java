package Programación.UD4;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Introduce un valor para la base: ");
        float b = input.nextFloat();
        System.out.print("Introduce un valor para la altura: ");
        float h = input.nextFloat();
        float area = b * h / 2;

        System.out.print("El area es: " + (area));
    }
}
