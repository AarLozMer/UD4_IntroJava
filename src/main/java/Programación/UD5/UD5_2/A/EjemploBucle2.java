package Programación.UD5.UD5_2.A;

import java.util.Scanner;

public class EjemploBucle2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max;
        System.out.print("Ingrese el maximo: ");
        max = input.nextInt();

        for (int i = 1; i <= max; i++) {
            System.out.println("Número: " + i );
        }
    }
}
