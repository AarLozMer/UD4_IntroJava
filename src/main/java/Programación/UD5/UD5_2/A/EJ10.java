package Programación.UD5.UD5_2.A;

import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean excelente = false;
        int num = 0;
        do {
            System.out.print("Introduce un número: ");
            num = sc.nextInt();
            if (num > 10) {
                System.out.print("Introduce otro número");
            }
            if (num == 10) {
                excelente = true;

            }
        } while (num != -1);
        if (excelente) {
            System.out.print("Hay algún 10");
        }
        else {
            System.out.print("No hay ningún 10");
        }
    }

}
