package Programación.UD6.UD6_1.A;

import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n[] = new double[100];

        int igual = 0;
        System.out.println("Introduzca un número entre el 0 y el 1: ");
        double r = sc.nextDouble();

        for (int i = 0; i < n.length; i++) {
            n[i] = (double) (Math.random()* 1.0) +0;
            if (n[i] > r) {
                igual++;
            }

        }
        System.out.print("Hay " + igual + " valores iguales al introducido ");
    }
}

