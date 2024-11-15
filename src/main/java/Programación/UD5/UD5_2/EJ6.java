package Programación.UD5.UD5_2;

import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean negativo = false;

        for (int i = 0; i <= 100; i++) {
            System.out.print("Introduce un numero: ");
            int num = sc.nextInt();
            if (num < 0) {
                negativo = true;
            }
        }
        if (negativo) {
            System.out.println("Hay número negativo");
        } else {
            System.out.println("No hay números negativos");
        }
    }
}
