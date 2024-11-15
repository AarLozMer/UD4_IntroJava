package Programación.UD4;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese las millas marinas: ");
        int num = sc.nextInt();
        int milla = num * 1852;
        System.out.println("Las millas marinas son: " + milla + " metros");

    }
}
