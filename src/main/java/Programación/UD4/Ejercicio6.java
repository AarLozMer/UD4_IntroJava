package Programación.UD4;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el valor del lado: ");
        float lado = input.nextFloat();
        float area = lado * lado;
        System.out.println("El area del cuadrado es: " + area);


    }
}
