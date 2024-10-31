package Programación.UD4;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Escribe un valor: ");
        float a = input.nextFloat();
        System.out.print("Escribe otro valor: ");
        float b = input.nextFloat();

        float suma = a + b;
        float resta = a - b;
        float producto = a * b;
        float division = a / b;
        System.out.println("Este es el resultado de la suma: " + suma);
        System.out.println("Este es el resultado de la resta: " + resta);
        System.out.println("Este es el resultado del producto: " + producto);
        System.out.println("Este es resultado de la division:" + division);
    }
}
