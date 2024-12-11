package Programación.UD6.UD6_1;

import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n[] = new double[100];

        int igual = 0;
        double max = 1;
        double min = 0;

        for (int i = 0; i < n.length; i++) {
            n[i] = (double) (Math.random() * (max - min)) + min;
        }
        System.out.print("Introduce un valor real: ");
        double v = sc.nextDouble();
        for (int i = 0; i < n.length; i++) {
            if (n[i] == v) {
                igual += 1;
            }


        }
        System.out.print("Hay " + igual + " valores iguales al introducido ");
    }
}

